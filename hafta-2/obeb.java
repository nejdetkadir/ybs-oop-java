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
public class obeb {
    public static void main(String[] args) {
        Scanner klavye= new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        int sayi1=klavye.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2=klavye.nextInt();
        System.out.println("Obebi: "+obeb(sayi1, sayi2));
    }
    
    public static int obeb(int n1, int n2){
        int bolen=2;
        int obebi=1;
        
        while(bolen <= n1 && bolen<=n2){
            if(n1%bolen==0 && n2%bolen==0){
                obebi=bolen;
            }
            bolen++;
        }
        return obebi;
    }
    
}
