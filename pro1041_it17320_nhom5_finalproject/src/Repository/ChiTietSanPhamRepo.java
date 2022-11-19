/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Model.ChiTietSanPham;
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
public class ChiTietSanPhamRepo {

    public ArrayList<ChiTietSanPham> getList() {
        ArrayList<ChiTietSanPham> list = new ArrayList<>();
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "select Id,GiaNhap,GiaBan,SoLuongTon,Ram,CPU,SerialNumber,CardMang,KichThuoc,ManHinh,CongKetNoi from ChiTietSP";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                double giaNhap = rs.getDouble("GiaNhap");
                double giaBan = rs.getDouble("GiaBan");
                int slton = rs.getInt("SoLuongTon");
                String ram = rs.getString("Ram");
                String cpu = rs.getString("CPU");
                String serialNumber = rs.getString("SerialNumber");
                String cardMang = rs.getString("CardMang");
                String kichThuoc = rs.getString("KichThuoc");
                String manHinh = rs.getString("ManHinh");
                String congKetNoi = rs.getString("CongKetNoi");
                String idSP = rs.getString("IdSP");
                String idNCC = rs.getString("IdNCC");
                String idMS = rs.getString("IdMS");
                String idDSP = rs.getString("IdDSP");
                ChiTietSanPham ctsp = new ChiTietSanPham(id, giaNhap, giaBan, slton, ram, cpu, serialNumber, cardMang, kichThuoc, manHinh, congKetNoi, idSP, idNCC, idMS, idDSP);
                list.add(ctsp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSanPhamRepo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public void insert(ChiTietSanPham ctsp) {
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "Insert into ChiTietSP (GiaNhap,GiaBan,Ram,CPU,SerialNumber,CardMang,KichThuoc,ManHinh,CongKetNoi,SoLuongTon)"
                    + " values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, ctsp.getGiaNhap());
            ps.setDouble(2, ctsp.getGiaBan());
            ps.setString(3, ctsp.getRam());
            ps.setString(4, ctsp.getCpu());
            ps.setString(5, ctsp.getSerialNumber());
            ps.setString(6, ctsp.getCardMang());
            ps.setString(7, ctsp.getKichThuoc());
            ps.setString(8, ctsp.getManHinh());
            ps.setString(9, ctsp.getCongKetNoi());
            ps.setInt(10, ctsp.getSoLuongTon());
//            ps.setString(11, ctsp.getIdSP());
//            ps.setString(12, ctsp.getIdNCC());
//            ps.setString(13, ctsp.getIdMS());
//            ps.setString(14, ctsp.getIdDSP());
            ps.executeUpdate();
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }
    
    

    public void update(ChiTietSanPham ctsp, String id) {
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "update ChiTietSP "
                    + "set GiaNhap = ?,GiaBan = ?,SoLuongTon = ?,Ram = ?,CPU= ?,SerialNumber = ?,CardMang= ?,KichThuoc = ?,ManHinh = ?,CongKetNoi = ? "
                    + "where Id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDouble(1, ctsp.getGiaNhap());
            ps.setDouble(2, ctsp.getGiaBan());
            ps.setInt(3, ctsp.getSoLuongTon());
            ps.setString(4, ctsp.getRam());
            ps.setString(5, ctsp.getCpu());
            ps.setString(6, ctsp.getSerialNumber());
            ps.setString(7, ctsp.getCardMang());
            ps.setString(8, ctsp.getKichThuoc());
            ps.setString(9, ctsp.getManHinh());
            ps.setString(10, ctsp.getCongKetNoi());
//            ps.setString(11, ctsp.getIdSP());
//            ps.setString(12, ctsp.getIdNCC());
//            ps.setString(13, ctsp.getIdMS());
//            ps.setString(14, ctsp.getIdDSP());
            ps.setString(11, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSanPhamRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(String id){
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "delete from ChiTietSP where Id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ChiTietSanPhamRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
