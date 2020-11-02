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
public class Cember {
       
    double yariCap=1;
    //parametresiz
    Cember(){
       yariCap=5;  
     }
    
    //parametreli
    Cember(double y){
        yariCap=y;
    }
    
    
    
    double alanHesapla(){
        return yariCap*yariCap*Math.PI;}
    
    double cevreHesapla(){
        return 2*yariCap*Math.PI;
    }
    
    void yariCapGuncelle(double y){
        yariCap = y; 
    }
}
