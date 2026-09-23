package com.napier.sem;

import java.sql.*;

public class Database {
    private Connection con = null;

    public void connect() {
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL container
            con = DriverManager.getConnection(
                    "jdbc:mysql://db:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "example"
            );

            System.out.println("Successfully connected");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}