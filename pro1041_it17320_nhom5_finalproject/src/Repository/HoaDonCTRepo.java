/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import JDBC.JDBCUtil;
import Model.HoaDon;
import Model.HoaDonChiTiet;
import ViewModel.HoaDonCTViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonCTRepo {

    public List<HoaDonCTViewModel> all() {
        List<HoaDonCTViewModel> listHd = new ArrayList<>();
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "select hd.Ma as 'MaHD' ,SoLuong,DonGia from HoaDonChiTiet hdct join HoaDon hd on hd.Id=hdct.IdHD";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String ma = rs.getString("MaHD");
                HoaDon hd = new HoaDon();
                hd.setMa(ma);

                int sl = rs.getInt("SoLuong");
                double dgia = rs.getDouble("DonGia");
//                double tienKM = rs.getDouble("TienKM");
                HoaDonCTViewModel hdv = new HoaDonCTViewModel();
                hdv.setHd(hd);
                hdv.setSoLuong(sl);
                hdv.setDonGia(dgia);
//                hdv.setTienKM(tienKM);
                listHd.add(hdv);

            }
            return listHd;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public Integer inserHDCTR(HoaDonChiTiet hdct) {
        Integer kq = -1;
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "Insert into HoaDonChiTiet " + "(SoLuong,DonGia)" + " Values(?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, hdct.getSoLuong());
            ps.setDouble(2, hdct.getDonGia());
            kq = ps.executeUpdate();
            return kq;
        } catch (Exception e) {
            e.printStackTrace(System.out);

        }
        return null;

    }

    public Integer updateHDCTR(HoaDonChiTiet hdct, String id) {
        Integer kq = -1;
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "update HoaDonChiTiet set SoLuong=?,DonGia=? Where Id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, hdct.getSoLuong());
            ps.setDouble(2, hdct.getDonGia());
            ps.setString(3, id);
            kq = ps.executeUpdate();
            return kq;
        } catch (Exception e) {
            e.printStackTrace(System.out);

        }
        return null;

    }

    public Integer deleteHDR(String id) {
        Integer kq = -1;
        try {
            Connection conn = JDBCUtil.getConnection();
            String sql = "Delete From HoaDonChiTiet Where Id=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);

            kq = ps.executeUpdate();
            return kq;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

}
