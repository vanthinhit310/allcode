package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static Connection con = getConnection();

    public static Connection getInstace() {
        if (con == null) return getConnection();
        return con;
    }


    private static Connection getConnection() {


        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://ec2-54-227-240-7.compute-1.amazonaws.com:5432/d8ql01thqpd300?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory&foo=true",
                    "sdigxsaxrhqedf",
                    "208923c6a2d611e8b2239c734f1383c3709d8596ab834db2f42b6d3f89f4f97a");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return connection;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
