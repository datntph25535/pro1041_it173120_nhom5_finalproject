/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.ChiTietSanPham;
import Model.PhieuBaoHanh;
import Model.PhieuBaoHanhCT;
import ViewModel.BaoHanhCTViewModel;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class BaoHanhCTRepo {

    public List<BaoHanhCTViewModel> getAll() {
        String sql = "SELECT [IdCTSP]\n"
                + "      ,[IdBH]\n"
                + "      ,[SoLuong]\n"
                + "      ,[NgayNhanSP]\n"
                + "      ,[MoTa]\n"
                + "  FROM [dbo].[ChiTietBaoHanh]";
        try (Connection con = JDBC.JDBCUtil.getConnection(); PreparedStatement pstm = con.prepareStatement(sql)){
            ResultSet rs = pstm.executeQuery();
            List<BaoHanhCTViewModel> listBHCT  = new ArrayList<>();
            while (rs.next()) {                
                BaoHanhCTViewModel bhct = new BaoHanhCTViewModel((new ChiTietSanPham(rs.getString(1))), (new PhieuBaoHanh(rs.getString(2))),rs.getInt(3), rs.getDate(4), rs.getString(5));
                listBHCT.add(bhct);
            }
            return listBHCT;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean add(PhieuBaoHanhCT bhct) {
        String sql = "INSERT INTO INSERT INTO [dbo].[ChiTietBaoHanh]\n" +
"           ([IdCTSP]\n" +
"           ,[IdBH]\n" +
"           ,[SoLuong]\n" +
"           ,[NgayNhanSP]\n" +
"           ,[MoTa])\n" +
"      VALUES(?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try (Connection con = new JDBC.JDBCUtil().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, bhct.getIdCtsp().getId());
            ps.setObject(2, bhct.getIdBH().getId());
            ps.setObject(3, bhct.getSoLuong());
            ps.setObject(4, bhct.getNgNhan());
            ps.setObject(5, bhct.getMoTa());
            

            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
   
  

    public boolean delete(String IdBH) {
        String sql = "DELETE FROM [dbo].[ChiTietBaoHanh]\n" +
"      WHERE IdBH =?";
        int check = 0;
        try (Connection con = new JDBC.JDBCUtil().getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, IdBH);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

}
