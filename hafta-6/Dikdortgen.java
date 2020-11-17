/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafta6;

/**
 *
 * @author Zeynep
 */
public class Dikdortgen extends GeometrikNesne{
    private double genislik;
    private double yukseklik;

    public Dikdortgen() {
    }

    public Dikdortgen(double genislik, double yukseklik, String renk, boolean doluMu) {
        super(renk, doluMu);
        this.genislik = genislik;
        this.yukseklik = yukseklik;
    }
    
    public double alanHesapla(){
        return genislik*yukseklik;
    }
    public double cevreHesapla(){
        return 2*(genislik+yukseklik);
    }
    
    public void yazdir(){
        System.out.println(super.getOlusturulmaTarihi()+
                " tarihinde oluşturuldu ve genişliği: "+
                getGenislik()+" yuksekliği: "+
                getYukseklik());
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }
    
    
    
}
