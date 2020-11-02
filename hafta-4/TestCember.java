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
public class TestCember {
    public static void main(String[] args) {
        Cember cember1= new Cember();
        cember1.yariCapGuncelle(5);
        System.out.println("Alanı: "+cember1.alanHesapla());
        System.out.println("Cevresi: "+cember1.cevreHesapla());
        
        Cember cember2=new Cember(15);
        System.out.println("Alanı: "+cember2.alanHesapla());
        System.out.println("Cevresi: "+cember2.cevreHesapla());
        
        
        System.out.println(new Cember(100).alanHesapla());
        System.out.println(new Cember(100).cevreHesapla());
        
        
    }
}
