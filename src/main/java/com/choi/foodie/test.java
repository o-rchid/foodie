package com.choi.foodie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/foodie";
        String username = "foodie";
        String password = "1234";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            // Do something with the connection
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }
}