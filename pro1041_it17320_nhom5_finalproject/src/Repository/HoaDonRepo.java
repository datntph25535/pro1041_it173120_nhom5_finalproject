/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import JDBC.JDBCUtil;
import Model.HoaDon;
import ViewModel.HoaDonViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class HoaDonRepo {


    public List<HoaDon> all() {
        List<HoaDon> listHD = new ArrayList<>();

        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "Select Id,Ma,NgayThanhToan,NgayNhan,NgayTao,DiaChi,Sdt,TinhTrang From HoaDon";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                Date ngaytt = rs.getDate("NgayThanhToan");
                Date ngaynhan = rs.getDate("NgayNhan");
                Date ngaytao = rs.getDate("NgayTao");
                String dchi = rs.getString("DiaChi");
                String sdt = rs.getString("Sdt");
                String tt = rs.getString("TinhTrang");

                HoaDon hdv = new HoaDon(id, ma, ngaytt, ngaynhan, ngaytao, dchi, sdt, tt);
                listHD.add(hdv);
            }
            return listHD;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;

    }

    public Integer insertHDR(HoaDon hd) {
        Integer kq = -1;
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "Insert into HoaDon " + "(Ma,NgayThanhToan,NgayNhan,NgayTao,DiaChi,Sdt,TinhTrang)" + " Values(?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, hd.getMa());
            ps.setDate(2, (java.sql.Date) hd.getNgayThanhToan());
            ps.setDate(3, (java.sql.Date) hd.getNgayNhan());
            ps.setDate(4, (java.sql.Date) hd.getNgayTao());
            ps.setString(5, hd.getDiaChi());
            ps.setString(6, hd.getSdt());
            ps.setString(7, hd.getTinhTrang());
            kq = ps.executeUpdate();
            return kq;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public Integer upadteHDR(HoaDon hd, String ma) {
        Integer kq = -1;
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "Update HoaDon Set NgayThanhToan=?,NgayNhan=?,NgayTao=?,DiaChi=?,Sdt=?,TinhTrang=? Where Ma=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(7, ma);
            ps.setDate(1, (java.sql.Date) hd.getNgayThanhToan());
            ps.setDate(2, (java.sql.Date) hd.getNgayNhan());
            ps.setDate(3, (java.sql.Date) hd.getNgayTao());
            ps.setString(4, hd.getDiaChi());
            ps.setString(5, hd.getSdt());
            ps.setString(6, hd.getTinhTrang());
            kq = ps.executeUpdate();
            return kq;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public Integer deleteHDR(String ma) {
        Integer kq = -1;
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "Delete From HoaDon Where Ma=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);

            kq = ps.executeUpdate();
            return kq;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }
}
