/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.crudjdbc;

/**
 *
 * @author khali
 */
public class TestMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UserCrudImplement uci=new UserCrudImplement();
        //uci.saveUser("khalil");
//        uci.deleteUser(2);
uci.updateUser(1, "admin teste");
    }
    
}
