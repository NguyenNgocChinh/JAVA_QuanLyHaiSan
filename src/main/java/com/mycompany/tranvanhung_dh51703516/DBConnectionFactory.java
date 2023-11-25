/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tranvanhung_dh51703516;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionFactory {

    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/dbhaisan?serverTimezone=UTC";
    private static final String DATABASE_USER_NAME = "root";
    private static final String DATABASE_PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL, DATABASE_USER_NAME, DATABASE_PASSWORD);
    }
}
