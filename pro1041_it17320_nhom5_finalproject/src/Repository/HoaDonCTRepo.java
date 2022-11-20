/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import JDBC.JDBCUtil;
import Model.ChiTietSanPham;
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
            String sql = "select hd.Ma as 'Ma HD',ctsp.Id as'IdHDCT',SoLuong,DonGia from HoaDonChiTiet hdct join HoaDon hd on hd.Id=hdct.IdHD \n"
                    + "join ChiTietSP ctsp on ctsp.Id=hdct.IdCTSP";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                String ma = rs.getString("Ma HD");
                HoaDon hd = new HoaDon();
                hd.setMa(ma);
                String isct = rs.getString("IdCTSP");
                ChiTietSanPham ctsp = new ChiTietSanPham();
                ctsp.setId(isct);
                int sl = rs.getInt("SoLuong");
                double dgia = rs.getDouble("DonGia");
//                double tienKM = rs.getDouble("TienKM");
                HoaDonCTViewModel hdv = new HoaDonCTViewModel();
                hdv.setHd(hd);
                hdv.setCtsp(ctsp);
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
            String sql = "Insert into HoaDonChiTiet " + "(IdHD,IdCTSP,SoLuong,DonGia)" + " Values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            String idhd = null;
            if (hdct.getHd() != null) {
                idhd = hdct.getHd().getId();
            }
            String idctSP = null;

            if (hdct.getCtsp() != null) {
                idctSP = hdct.getCtsp().getId();
            }
            ps.setString(1, idhd);
            ps.setString(2, idctSP);
            ps.setInt(3, hdct.getSoLuong());
            ps.setDouble(4, hdct.getDonGia());
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
