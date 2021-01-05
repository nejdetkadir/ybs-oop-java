/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafta11;

import java.util.Scanner;

/**
 *
 * @author Zeynep
 */
public class throwOrnegi {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        int yas=klavye.nextInt();
        
        
        try{
        yas_kontrol(yas);    
        }
        
        catch(ArithmeticException e){
            System.out.println("20 yaşından küçükler dışarı çıkamaz!!");
        }
        
    }
    
    public static void yas_kontrol(int yas){
        if(yas < 20){
            throw new ArithmeticException();
        }
        else{
            System.out.println("Dışarı çıkabilirsiniz...");
        }
           
    }
    
}
