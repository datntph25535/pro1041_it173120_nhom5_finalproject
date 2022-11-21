/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import JDBC.JDBCUtil;
import Model.NhaCungCap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class NhaCungCapRepo {

    public void insert(NhaCungCap ncc) {
        try {

            Connection conn = JDBCUtil.getConnection();
            String sql = "INSERT INTO NhaCungCap(Ma,Ten,Sdt,Email,DiaChi,ThanhPho,QuocGia) VALUES(?,?,?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ncc.getMaNcc());
            ps.setString(2, ncc.getTen());
            ps.setString(3, ncc.getSdt());
            ps.setString(4, ncc.getEmail());
            ps.setString(5, ncc.getDiaChi());
            ps.setString(6, ncc.getThanhPho());
            ps.setString(7, ncc.getQuocGia());
            ps.execute();
            System.out.println("Truy vấn thành công");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void update(String id, NhaCungCap ncc) {
        try {

            Connection conn = JDBCUtil.getConnection();
            String sql = "UPDATE NhaCungCap SET Ma =?,Ten=?,Sdt=?,Email=?,DiaChi=?, ThanhPho=?, QuocGia=? WHERE id=?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ncc.getMaNcc());
            ps.setString(2, ncc.getTen());
            ps.setString(3, ncc.getSdt());
            ps.setString(4, ncc.getEmail());
            ps.setString(5, ncc.getDiaChi());
            ps.setString(6, ncc.getThanhPho());
            ps.setString(7, ncc.getQuocGia());
            ps.setString(8, ncc.getId());
            ps.execute();
            System.out.println("Sửa đổi thành công");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void delete(String id) {
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "DELETE FROM NhanCungCap WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.execute();
            System.out.println("Xóa thành công");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public ArrayList<NhaCungCap> all() {
        ArrayList<NhaCungCap> listNcc = new ArrayList<>();
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "SELECT * FROM NhaCungCap";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String sdt = rs.getString("Sdt");
                String email = rs.getString("Email");
                String diaChi = rs.getString("DiaChi");
                String thanhPho = rs.getString("ThanhPho");
                String quocGia = rs.getString("QuocGia");

                NhaCungCap ncc = new NhaCungCap(id,ma,ten,sdt,email,diaChi,thanhPho,quocGia);
                listNcc.add(ncc);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listNcc;
    }
}
