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
public class TV {
   int kanal=1;
   int sesSeviyesi=1;
   boolean acikMi=false;

    public TV() {
        
    }
   
    public void ac(){
        acikMi=true;
    }
    
    public void kapat(){
        acikMi=false;
    }
    
    public void kanaliAyarla(int yeniKanal){
        if(acikMi && yeniKanal >=1 && yeniKanal<=120){
            kanal=yeniKanal;
        }
    }
    
    public void sesiAyarla(int yeniSes){
        if(acikMi && yeniSes>=1 && yeniSes<=7){
            sesSeviyesi=yeniSes;
        }
    }
    
    public void kanalYukari(){
        if(acikMi && kanal<120){
            kanal++;
        }
    }
    
    public void kanalAsagi(){
        if(acikMi && kanal>1){
            kanal--;
        }
    }
    
    public void sesYukari(){
        if(acikMi && sesSeviyesi<7){
            sesSeviyesi++;
        }
    }
    
    public void sesAsagi(){
        if(acikMi && sesSeviyesi>1){
            sesSeviyesi--;
        }
    }
   
   
   
   
}
