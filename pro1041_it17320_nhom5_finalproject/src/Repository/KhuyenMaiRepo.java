/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import JDBC.JDBCUtil;
import Model.KhuyenMai;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class KhuyenMaiRepo {
    public void insert(KhuyenMai km) {
        try {

            Connection conn = JDBCUtil.getConnection();
            String sql = "INSERT INTO (Ma,Ten,PhanTramKM) VALUES(?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, km.getMa());
            ps.setString(2, km.getTen());
            ps.setString(3, km.getPhanTramKM());
           
            ps.execute();
            System.out.println("Truy vấn thành công");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void update(String id, KhuyenMai km) {
        try {

            Connection conn = JDBCUtil.getConnection();
            String sql = "UPDATE KhuyenMai SET Ma =?,Ten=?,PhanTramKM=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, km.getMa());
            ps.setString(2, km.getTen());
            ps.setString(3, km.getPhanTramKM());
            ps.setString(4, km.getId());
            ps.execute();
            System.out.println("Sửa đổi thành công");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void delete(String id) {
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "DELETE FROM KhuyenMai WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.execute();
            System.out.println("Xóa thành công");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public ArrayList<KhuyenMai> all() {
        ArrayList<KhuyenMai> listKM = new ArrayList<>();
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "SELECT * FROM KhuyenMai";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String phanTramKM = rs.getString("PhanTramKM");

                KhuyenMai km = new KhuyenMai(id,ma,ten,phanTramKM);
                listKM.add(km);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return listKM;
    }
}
