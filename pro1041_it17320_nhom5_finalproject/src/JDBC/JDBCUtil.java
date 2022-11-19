/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class JDBCUtil {

    private static Connection conn;

    public static Connection getConnection() {


        if (conn == null) {

        if (JDBCUtil.conn == null) {

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUser = "sa", dbPass = "123456", dbUrl = "jdbc:sqlserver://localhost:1433;databaseName = DuAn1_Nhom5";
                JDBCUtil.conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
                System.out.println("ket noi thanh cong");
            } catch (ClassNotFoundException | SQLException ex) {
                ex.printStackTrace();
            }
        }
        return conn;
    }
}
