/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import JDBC.JDBCUtil;
import Model.ChucVu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class ChucVuRepo {
    public void insert(ChucVu cv){
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "insert into ChucVu" + "(Ma, Ten)" + "values (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cv.getMa());
            ps.setString(2, cv.getTen());
            ps.execute();
        } catch (Exception ex) {
            Logger.getLogger(DangNhapRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void delete(String id){
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "delete from ChucVu where Ma = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(DangNhapRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void update(String id, ChucVu cv){
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "update ChucVu set Ma = ?, Ten = ? where Id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cv.getMa());
            ps.setString(2, cv.getTen());
            ps.setString(3, id);
            ps.executeUpdate();
        } catch (Exception ex) {
            Logger.getLogger(DangNhapRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<ChucVu> getList(){
        ArrayList<ChucVu> listCV = new ArrayList<>();
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "select * from ChucVu";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {                
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                ChucVu cv = new ChucVu(id, ma, ten);
                listCV.add(cv);
            }
        } catch (Exception ex) {
            Logger.getLogger(DangNhapRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listCV;
    }
    
    public ChucVu search(String ma){
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "select * from ChucVu where Ma = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            if (rs.next()) {                
                String id = rs.getString("Id");
                String ten = rs.getString("Ten");
                ChucVu cv = new ChucVu(id, ma, ten);
                return cv;
            }else{
                return null;
            }
        } catch (Exception ex) {
            Logger.getLogger(DangNhapRepo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
