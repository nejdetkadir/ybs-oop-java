/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafta6;

import java.util.Date;

/**
 *
 * @author Zeynep
 */
public class TestOgrenci {
    public static void main(String[] args) {
        Ogrenci ogr1=new Ogrenci(1111, "Ahmet");
        
        Date yeniTarih=ogr1.getOlusturulmaTarihi();
        yeniTarih.setTime(99999999);
        
        System.out.println("No: "+ogr1.getOgrenciNo()+
                "\nAdi: "+ ogr1.getAdi()+
                "\nKayit Tarihi: "+ogr1.getOlusturulmaTarihi());
        
    }
}
