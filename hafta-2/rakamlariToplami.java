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
public class rakamlariToplami {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir sayı gırınız: ");
        int sayi=klavye.nextInt();
        
        System.out.println(sayi+" rakamlari toplamı: "+rakamlarinToplami(sayi));
    }
     public static int rakamlarinToplami(int sayi){
         int gecici=sayi;
         int toplam=0;
      
         while(gecici!=0){ //345, 34, 3,0
             int rakam=gecici%10;  //345%10=5, 34%10=4, 3%10=3
             toplam += rakam;  //toplam =0+5+4+3
             gecici=gecici/10;  //gecici =345/10=34 34/10=3 3/10=0
         }
         return toplam;
     }
    
}
