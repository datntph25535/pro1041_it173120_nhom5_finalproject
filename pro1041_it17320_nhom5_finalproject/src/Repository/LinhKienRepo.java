/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Model.LinhKien;
import java.sql.Connection;
import java.util.ArrayList;
import JDBC.JDBCUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class LinhKienRepo {

    public ArrayList<LinhKien> getAll() {
        ArrayList<LinhKien> list = new ArrayList<>();
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "select * from LinhKien";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString(1);
                String ma = rs.getString(2);
                String ten = rs.getString(3);
                LinhKien lk = new LinhKien(id, ma, ten);
                list.add(lk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LinhKienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void insert(LinhKien lk) {
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "insert into LinhKien (Ma, Ten) values(?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, lk.getMaLinhKien());
            ps.setString(2, lk.getTenLinhKien());
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    

    public void update(LinhKien lk, String ma) {
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "update LinhKien set Ma = ?, Ten = ? where Ma = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, lk.getMaLinhKien());
            ps.setString(2, lk.getTenLinhKien());
            ps.setString(3, ma);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LinhKienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(String ma) {
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "delete from LinhKien where Ma = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LinhKienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
