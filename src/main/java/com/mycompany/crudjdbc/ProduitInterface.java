/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.crudjdbc;

/**
 *
 * @author khali
 */
public interface ProduitInterface {
    public void insertProduit(String titre, int prix);
    public void updateProduit(String titre,int prix, int id);
    
}
