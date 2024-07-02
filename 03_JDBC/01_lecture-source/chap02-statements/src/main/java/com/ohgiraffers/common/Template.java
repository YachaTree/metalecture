package com.ohgiraffers.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Template {

    public static Connection getConnection() {

        Connection con = null;
        Properties props = new Properties();


        try {
            props.load(
                    new FileInputStream(
                    "src/main/java/com/ohgiraffers/config/connection-info.properties"));

            String url = props.getProperty("url");
            String driver = props.getProperty("driver");

            Class.forName(driver);

            con = DriverManager.getConnection(url, props);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return con;
    }

    public static void close(Connection con) {
        try {
                if (con != null & !con.isClosed()) {
                        con.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    public static void close(Statement stmt) {
        try {
            if(stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close(ResultSet stmt) {
        try {
            if(stmt != null && !stmt.isClosed()) {
                stmt.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
