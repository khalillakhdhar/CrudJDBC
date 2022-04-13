/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.crudjdbc;

/**
 *
 * @author khali
 */
public interface UserCrud {
    public void saveUser(String nom);
    public void deleteUser(int id);
    public void showList();
    public void updateUser(int id,String nom);
    
}
