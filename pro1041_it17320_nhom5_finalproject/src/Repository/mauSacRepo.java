/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import JDBC.JDBCUtil;
import Model.MauSac;
import ViewModel.mauSacViewModel;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class mauSacRepo {

    public List<mauSacViewModel> getAll() {
        String sql = " SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[MauSac] ";
        try ( Connection con = JDBCUtil.getConnection();  PreparedStatement pstm = con.prepareStatement(sql);) {
            ResultSet rs = pstm.executeQuery();
            List<mauSacViewModel> listMS = new ArrayList<>();
            while (rs.next()) {
                mauSacViewModel ms = new mauSacViewModel(rs.getString(1), rs.getString(2), rs.getString(3));
                listMS.add(ms);
            }
            return listMS;

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(MauSac ms) {
        int check = 0;
        String SQL = " INSERT INTO [dbo].[MauSac]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES (?,?)";
        try ( Connection con = JDBCUtil.getConnection();  PreparedStatement pstm = con.prepareStatement(SQL)) {
            pstm.setObject(1, ms.getMaMS());
            pstm.setObject(2, ms.getTenMS());

            check = pstm.executeUpdate();
            //nếu câu query thành công thì check = 1;
            // Trả ra 1 khi thành công va 0 khi thất bại
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        // Nếu thành công thì check > 1
        // return 1> 0 ; return true;
        // Nếu thất bại thì check 0=0
        //return 0 > 0 ; return false;
        return check > 0;

    }

    public boolean update(MauSac ms, String id) {
        int check = 0;
        String sql = "UPDATE [dbo].[MauSac]\n"
                + "   SET [Ma] = ?\n"
                + "      ,[Ten] =?\n"
                + " WHERE id = ?";
        try ( Connection con = JDBCUtil.getConnection();  PreparedStatement pstm = con.prepareStatement(sql)) {

            pstm.setObject(1, ms.getMaMS());
            pstm.setObject(2, ms.getTenMS());
            pstm.setObject(3, id);
            check = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String id) {
        int check = 0;
        String sql = "DELETE FROM [dbo].[MauSac]\n"
                + "      WHERE id = ?";
        try ( Connection con = JDBCUtil.getConnection();  PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

}
