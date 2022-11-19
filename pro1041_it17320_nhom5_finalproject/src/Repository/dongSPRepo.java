/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import JDBC.JDBCUtil;
import Model.Account;
import Model.dongSP;
import ViewModel.AccountViewModel;
import ViewModel.dongSpViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class dongSPRepo {

    public List<dongSpViewModel> getAll() {
        String sql = " SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[DongSP] ";
        try ( Connection con = JDBCUtil.getConnection();  PreparedStatement pstm = con.prepareStatement(sql);) {
            ResultSet rs = pstm.executeQuery();
            List<dongSpViewModel> listdongSp = new ArrayList<>();
            while (rs.next()) {
                dongSpViewModel dsp = new dongSpViewModel(rs.getString(1), rs.getString(2), rs.getString(3));
                listdongSp.add(dsp);

            }
            return listdongSp;

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(dongSP dsp) {
        int check = 0;
        String SQL = " INSERT INTO [dbo].[DongSP]\n"
                + "           ([Ma]\n"
                + "           ,[Ten]) VALUES (?,?)";
        try ( Connection con = JDBCUtil.getConnection();  PreparedStatement pstm = con.prepareStatement(SQL)) {
            pstm.setObject(1, dsp.getMaDSP());
            pstm.setObject(2, dsp.getTenDSP());

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

    public boolean update(dongSP dsp, String id) {
        int check = 0;
        String sql = "UPDATE [dbo].[DongSP]\n"
                + "   SET [Ma] = ?\n"
                + "      ,[Ten] = ?\n"
                + " WHERE id = ?";
        try ( Connection con = JDBCUtil.getConnection();  PreparedStatement pstm = con.prepareStatement(sql)) {

            pstm.setObject(1, dsp.getMaDSP());
            pstm.setObject(2, dsp.getTenDSP());
            pstm.setObject(3, id);
            check = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String id) {
        int check = 0;
        String sql = "DELETE FROM [dbo].[DongSP]\n"
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
