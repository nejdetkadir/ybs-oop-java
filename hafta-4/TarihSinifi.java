/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafta4;

/**
 *
 * @author Zeynep
 */
public class TarihSinifi {
    public static void main(String[] args) {
        java.util.Date tarih1= new java.util.Date();
        System.out.println(tarih1.toString());
        System.out.println(tarih1.getTime());
        
        java.sql.Date tarih2= new java.sql.Date(0);
        System.out.println(tarih2.toString());
    }
}
