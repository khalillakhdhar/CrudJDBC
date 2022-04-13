/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudjdbc;

/**
 *
 * @author khali
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connect {
String dbURL = "jdbc:mysql://localhost:3306/democrudjdbc";
String username = "root";
String password = "";
static Connection conn;
public Connect() {
try {
conn = DriverManager.getConnection(dbURL, username, password);
if (conn != null) {
System.out.println("Connected");
}
} catch (SQLException ex) {
    System.out.println("les paramétres de connexion sont incorrecte");
}
}
}
