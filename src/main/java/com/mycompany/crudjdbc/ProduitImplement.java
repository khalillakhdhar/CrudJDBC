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
public class ProduitImplement implements ProduitInterface{
Connect c=new Connect();

    @Override
    public void insertProduit(String titre, int prix) {
    try {
String sql = "INSERT INTO `produit`(`titre`, `prix`) VALUES (?,?)";
System.out.print(c.conn);
PreparedStatement statement = c.conn.prepareStatement(sql);
statement.setString(1,titre);
statement.setInt(2,prix);
int rowsInserted = statement.executeUpdate();
System.out.println("A new produt was inserted successfully!");
} catch (SQLException ex) {
Logger.getLogger(UserCrudImplement.class.getName()).log(Level.SEVERE, null, ex);
}  



    }

    @Override
    public void updateProduit(String titre, int prix, int id) {
try {
String sql = "UPDATE produit SET titre=?,prix=? WHERE id=?";
PreparedStatement statement = c.conn.prepareStatement(sql);
statement.setString(1,titre);
statement.setInt(2,prix);
statement.setInt(3, id);
int rowsUpdated = statement.executeUpdate();
if (rowsUpdated > 0) {
System.out.println("An existing user was updated successfully!");
}
} catch (SQLException ex) {
Logger.getLogger(UserCrudImplement.class.getName()).log(Level.SEVERE, null, ex);
}
    }
    
}
