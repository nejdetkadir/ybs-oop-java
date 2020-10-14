/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta22;

import java.util.Scanner;

/**
 *
 * @author Zeynep
 */
public class celToFah {
    public static void main(String[] args) {
    
        Scanner klavye = new Scanner(System.in);
        System.out.println("Fah değeri giriniz: ");
        double sayi1=klavye.nextDouble();
        System.out.println(fah2cel(sayi1));
        
        System.out.println("Cel değeri giriniz: ");
        double sayi2=klavye.nextDouble();
        System.out.println(cel2fah(sayi2));
        
    }
    
    public static double fah2cel(double fah){
        return (5.0/9)*(fah-32);
    }
    
    public static double cel2fah(double cel){
        return (9/5.0)*cel+32;
    }
}
