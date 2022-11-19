/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Model.ChiTietLinhKien;
import JDBC.JDBCUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class ChiTietLinhKienRepo {

    public ArrayList<ChiTietLinhKien> getAll() {
        ArrayList<ChiTietLinhKien> list = new ArrayList<>();
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "select * from ChiTietLinhKien";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String idLK = rs.getString("IdLk");
                String idHDCT = rs.getString("IdHDCT");
                int sl = rs.getInt("SoLuongTon");
                double giaNhap = rs.getDouble("GiaNhap");
                double giaBan = rs.getDouble("GiaBan");
                String moTa = rs.getString("MoTa");
                ChiTietLinhKien ctlk = new ChiTietLinhKien(idLK, idHDCT, sl, giaNhap, giaBan, moTa);
                list.add(ctlk);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietLinhKienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public void insert(ChiTietLinhKien ctlk) {
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "insert into ChiTietLinhKien (IdLK, IdHDCT,SoLuongTon, GiaNhap, GiaBan, MoTa)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ctlk.getIdLK());
            ps.setString(2, ctlk.getIdHDCT());
            ps.setInt(3, ctlk.getSoLuongTon());
            ps.setDouble(4, ctlk.getGiaNhap());
            ps.setDouble(5, ctlk.getGiaBan());
            ps.setString(6, ctlk.getMoTa());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietLinhKienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void update(ChiTietLinhKien ctlk, String idLK, String idHDCT) {
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "update ChiTietLinhKien set SoLuongTon = ?, GiaNhap = ?, GiaBan = ?, MoTa = ? where IdLK = ? and IdHDCT = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ctlk.getSoLuongTon());
            ps.setDouble(2, ctlk.getGiaNhap());
            ps.setDouble(3, ctlk.getGiaBan());
            ps.setString(4, ctlk.getMoTa());
            ps.setString(5, idLK);
            ps.setString(6, idHDCT);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietLinhKienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void delete(String idLK, String idHDCT) {
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "update ChiTietLinhKien set SoLuongTon = ?, GiaNhap = ?, GiaBan = ?, MoTa = ? where IdLK = ? and IdHDCT = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, idLK);
            ps.setString(2, idHDCT);
           
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietLinhKienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
