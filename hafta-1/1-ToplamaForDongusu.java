/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toplamafordongusu;

/**
 *
 * @author zozer
 */
public class ToplamaForDongusu {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here       
        
       int toplam=0;
       for (int i = 1; i <= 10; i++)
            toplam += i;
        System.out.println("1den 10a kadar olan sayilarin toplami: " + toplam);
        
        toplam=0;
        for (int i = 20; i <= 37; i++)
            toplam += i;
        System.out.println("20den 37ye kadar olan sayilarin toplami: " + toplam);
        
        toplam=0;
        for (int i = 35; i <= 49; i++)
            toplam += i;
        System.out.println("35den 49a kadar olan sayilarin toplami: " + toplam);

    }  
}
