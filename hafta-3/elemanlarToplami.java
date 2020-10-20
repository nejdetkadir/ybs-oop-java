/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafta3;

/**
 *
 * @author Zeynep
 */
public class elemanlarToplami {
    
    public static void main(String[] args) {
        double[] liste5=new double[5];
        double toplam=0;
        for (int i = 0; i < liste5.length; i++) {
            liste5[i]=Math.random()*10;
            System.out.println(liste5[i]); 
            toplam +=liste5[i];
        }
        System.out.println(toplam);
        
        
        
    }
    
}
