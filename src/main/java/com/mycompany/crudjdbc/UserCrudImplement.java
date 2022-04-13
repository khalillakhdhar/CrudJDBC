/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudjdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author khali
 */
public class UserCrudImplement implements UserCrud {
Connect c=new Connect();
    @Override
    public void saveUser(String nom) {
      try {
String sql = "INSERT INTO user (nom) VALUES (?)";
System.out.print(c.conn);
PreparedStatement statement = c.conn.prepareStatement(sql);
statement.setString(1,nom);
int rowsInserted = statement.executeUpdate();
System.out.println("A new user was inserted successfully!");
} catch (SQLException ex) {
Logger.getLogger(UserCrudImplement.class.getName()).log(Level.SEVERE, null, ex);
}  
        
    }

    @Override
    public void deleteUser(int id) {
try {
String sql = "DELETE FROM user WHERE id=?";
PreparedStatement statement = c.conn.prepareStatement(sql);
statement.setInt(1, id);
int rowsDeleted = statement.executeUpdate();
if (rowsDeleted> 0) {
System.out.println("A user was deleted successfully!");
} } catch (SQLException ex) {
Logger.getLogger(UserCrudImplement.class.getName()).log(Level.SEVERE, null, ex);
}    }

    @Override
    public void showList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateUser(int id, String nom) {
try {
String sql = "UPDATE user SET nom=? WHERE id=?";
PreparedStatement statement = c.conn.prepareStatement(sql);
statement.setString(1,nom);
statement.setInt(2, id);
int rowsUpdated = statement.executeUpdate();
if (rowsUpdated > 0) {
System.out.println("An existing user was updated successfully!");
}
} catch (SQLException ex) {
Logger.getLogger(UserCrudImplement.class.getName()).log(Level.SEVERE, null, ex);
}
    }
    
}
