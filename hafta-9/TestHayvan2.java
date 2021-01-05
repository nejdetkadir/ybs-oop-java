/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafta9;

/**
 *
 * @author Zeynep
 */
public class TestHayvan2 {
    public static void main(String[] args) {
       konustur(new Kedi("Duman")); 
       konustur(new Kopek("Gülbatur"));
       konustur(new At("Şahbatur"));
    }
    
    public static void konustur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }
            
            
            
            
            
            
}
