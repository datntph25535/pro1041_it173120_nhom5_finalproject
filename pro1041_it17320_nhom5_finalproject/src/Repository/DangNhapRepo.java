/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import JDBC.JDBCUtil;


import Model.Account;
import java.sql.Connection;
import JDBC.JDBCUtil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class DangNhapRepo {

    public Account getAccount(String user, String pass) {
        Account account = new Account();
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "select * from Account where UserName = ? and PassWord = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            if (!rs.next()) {
                return null;
            }
            account.setUsername(user);
            account.setPassword(pass);
            account.setRole(rs.getString("Role"));

        } catch (SQLException ex) {
            Logger.getLogger(DangNhapRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return account;
    }

    public ArrayList<Account> getListAccount() {
        ArrayList<Account> listaccount = new ArrayList<>();
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "select * from Account";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String u = rs.getString(1);
                String pass = rs.getString(2);
                String role = rs.getString(3);
                Account account = new Account(u, pass, role);
                listaccount.add(account);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DangNhapRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaccount;
    }

}
