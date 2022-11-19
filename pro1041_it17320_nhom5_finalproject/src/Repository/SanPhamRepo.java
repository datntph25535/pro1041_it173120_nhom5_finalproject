/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Model.SanPham;
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
public class SanPhamRepo {

    public ArrayList<SanPham> getAll() {
        ArrayList<SanPham> list = new ArrayList<>();

        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "select * from SanPham";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String idSP = rs.getString(1);
                String maSP = rs.getString(2);
                String tenSP = rs.getString(3);
                SanPham sp = new SanPham(idSP, maSP, tenSP);
                list.add(sp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void insert(SanPham sp) {
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "insert into SanPham (Ma, Ten)"
                    + " values(?,?) ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sp.getMaSP());
            ps.setString(2, sp.getTenSP());
            ps.execute();
        } catch (SQLException ex) {
           ex.printStackTrace(System.out);
        }
    }


    public void update(SanPham sp, String maSP) {
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "update SanPham set ma = ?, ten = ? where ma = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, sp.getMaSP());
            ps.setString(2, sp.getTenSP());
            ps.setString(3, maSP);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(String maSP) {
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "delete from SanPham where ma = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maSP);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
