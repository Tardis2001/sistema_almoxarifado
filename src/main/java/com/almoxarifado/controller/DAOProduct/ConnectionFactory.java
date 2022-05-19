package com.almoxarifado.controller.DAOProduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
    // This returns SQLITE database
    public static Connection GetConnection() {

        Connection con = null;
        try {
            String url = "jdbc:sqlite:Product.db";

            con = DriverManager.getConnection(url);
            Class.forName("org.sqlite.JDBC");
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(0);
            return null;
        }
        return con;
    }
}
