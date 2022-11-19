/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import JDBC.JDBCUtil;
import Model.KhachHang;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class KhachHangRepo {
    public void insert(KhachHang kh){
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "insert into KhachHang " + 
                    "(Ma, HoTen, NgaySinh, Sdt, GioiTinh, Email, DiaChi, ThanhPho, QuocGia) " + 
                    "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, kh.getMa());
            ps.setString(2, kh.getHoTen());
            ps.setDate(3, kh.getNgaySinh());
            ps.setString(4, kh.getSdt());
            ps.setString(5, kh.getGioiTinh());
            ps.setString(6, kh.getEmail());
            ps.setString(7, kh.getDiaChi());
            ps.setString(8, kh.getThanhPho());
            ps.setString(9, kh.getQuocGia());
            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(String ma){
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "delete from KhachHang where Ma = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(String id, KhachHang kh){
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "update KhachHang set Ma = ?, HoTen = ?, NgaySinh = ?, Sdt = ?, GioiTinh = ?, Email = ?, DiaChi = ?, ThanhPho = ?, QuocGia = ? where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, kh.getMa());
            ps.setString(2, kh.getHoTen());
            ps.setDate(3, kh.getNgaySinh());
            ps.setString(4, kh.getSdt());
            ps.setString(5, kh.getGioiTinh());
            ps.setString(6, kh.getEmail());
            ps.setString(7, kh.getDiaChi());
            ps.setString(8, kh.getThanhPho());
            ps.setString(9, kh.getQuocGia());
            ps.setString(10, kh.getId());
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<KhachHang> getList(){
        ArrayList<KhachHang> listKH = new ArrayList<>();
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "select * from KhachHang";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {                
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String hoTen = rs.getString("HoTen");
                Date ngaySinh = rs.getDate("NgaySinh");
                String sdt = rs.getString("Sdt");
                String gioiTinh = rs.getString("GioiTinh");
                String email = rs.getString("Email");
                String diaChi = rs.getString("DiaChi");
                String thanhPho = rs.getString("ThanhPho");
                String quocGia = rs.getString("QuocGia");
                KhachHang kh = new KhachHang(id, ma, hoTen, ngaySinh, sdt, gioiTinh, email, diaChi, thanhPho, quocGia);
                listKH.add(kh);
            }
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKH;
    }
    
    public KhachHang searchMa(String ma){
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "select * from KhachHang where Ma = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            if(rs.next()){
                String id = rs.getString("Id");
                String hoTen = rs.getString("HoTen");
                Date ngaySinh = rs.getDate("NgaySinh");
                String sdt = rs.getString("Sdt");
                String gioiTinh = rs.getString("GioiTinh");
                String email = rs.getString("Email");
                String diaChi = rs.getString("DiaChi");
                String thanhPho = rs.getString("ThanhPho");
                String quocGia = rs.getString("QuocGia");
                KhachHang kh = new KhachHang(id, ma, hoTen, ngaySinh, sdt, gioiTinh, email, diaChi, thanhPho, quocGia);
                return kh;
            }else{
                return null;
            }
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
