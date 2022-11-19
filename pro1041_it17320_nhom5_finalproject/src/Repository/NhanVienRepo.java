/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import JDBC.JDBCUtil;
import Model.ChucVu;
import Model.NhanVien;
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
public class NhanVienRepo {
    
    public void insert(NhanVien nv){
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "insert into NhanVien " + 
                    "(Ma, Hoten, NgaySinh, GioiTinh, Cmnd, Sdt, Email, DiaChi, MatKhau, IdChucVu, TrangThai)" +
                    "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMa());
            ps.setString(2, nv.getHoTen());
            ps.setDate(3, nv.getNgaySinh());
            ps.setString(4, nv.getGioiTinh());
            ps.setString(5, nv.getCmnd());
            ps.setString(6, nv.getSdt());
            ps.setString(7, nv.getEmail());
            ps.setString(8, nv.getDiaChi());
            ps.setString(9, nv.getMatKhau());
            ps.setString(11, nv.getTrangThai());
            String maCV = null;
            if(nv.getCv() != null){
                maCV = nv.getCv().getId();
            }
            ps.setString(10, maCV);
            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delele(String id){
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "delete from NhanVien where Id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(String id, NhanVien nv){
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "update NhanVien set Ma = ?, Hoten = ?, NgaySinh = ?, GioiTinh = ?, Cmnd = ?, Sdt = ?, Email = ?, DiaChi = ?, MatKhau = ?, IdChucVu = ?, TrangThai = ? where Id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nv.getMa());
            ps.setString(2, nv.getHoTen());
            ps.setDate(3, nv.getNgaySinh());
            ps.setString(4, nv.getGioiTinh());
            ps.setString(5, nv.getCmnd());
            ps.setString(6, nv.getSdt());
            ps.setString(7, nv.getEmail());
            ps.setString(8, nv.getDiaChi());
            ps.setString(9, nv.getMatKhau());
            ps.setString(11, nv.getTrangThai());
            String maCV = null;
            if(nv.getCv() != null){
                maCV = nv.getCv().getId();
            }
            ps.setString(10, maCV);
            ps.setString(12, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<NhanVien> getList(){
        ArrayList<NhanVien> listNV = new ArrayList<>();
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "select nv.Id, nv.Ma, nv.HoTen, nv.NgaySinh, nv.GioiTinh, nv.Cmnd, nv.Sdt, nv.Email, nv.DiaChi, nv.MatKhau, cv.Ma, nv.TrangThai from NhanVien nv join ChucVu cv on nv.IdChucVu = cv.Id";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {                
                String id = rs.getString(1);
                String ma = rs.getString(2);
                String hoTen = rs.getString(3);
                Date ngaySinh = rs.getDate(4);
                String gioiTinh = rs.getString(5);
                String cmnd = rs.getString(6);
                String sdt = rs.getString(7);
                String email = rs.getString(8);
                String diaChi = rs.getString(9);
                String matKhau = rs.getString(10);
                String maCV = rs.getString(11);
                String trangThai = rs.getString(12);
                
                ChucVu cv = new ChucVu();
                cv.setId(maCV);
                NhanVien nv = new NhanVien(id, ma, hoTen, ngaySinh, gioiTinh, cmnd, sdt, email, diaChi, matKhau, cv, trangThai);
                listNV.add(nv);
            }
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNV;
    }
    
    public NhanVien search(String ma){
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "select nv.Id, nv.Ma, nv.HoTen, nv.NgaySinh, nv.GioiTinh, nv.Cmnd, nv.Sdt, nv.Email, nv.DiaChi, nv.MatKhau, cv.IdChucVu, nv.TrangThai from NhanVien nv join ChucVu cv on nv.IdChucVu = cv.Id where nv.Ma = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            if(rs.next()){
                String id = rs.getString("Id");
                String hoTen = rs.getString("HoTen");
                Date ngaySinh = rs.getDate("NgaySinh");
                String gioiTinh = rs.getString("GioiTinh");
                String cmnd = rs.getString("Cmnd");
                String sdt = rs.getString("Sdt");
                String email = rs.getString("Email");
                String diaChi = rs.getString("DiaChi");
                String matKhau = rs.getString("MatKhau");
                String idChucVu = rs.getString("IdChucVu");
                String trangThai = rs.getString("TrangThai");
                ChucVu cv = new ChucVu();
                cv.setId(idChucVu);
                NhanVien nv = new NhanVien(id, ma, hoTen, ngaySinh, gioiTinh, cmnd, sdt, email, diaChi, matKhau, cv, trangThai);
                return nv;
            }
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
