/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafta3;

import java.util.Scanner;

/**
 *
 * @author Zeynep
 */
public class diziyeElemanEkleme {
    public static void main(String[] args) {
        int[] liste3=new int[3];
        Scanner klavye=new Scanner(System.in);
        System.out.println(liste3.length+" tane eleman giriniz: ");
        
        for (int i = 0; i < liste3.length; i++) {
            liste3[i]=klavye.nextInt();
        }
        
        for (int i = 0; i < liste3.length; i++) {
            System.out.println(liste3[i]+" ");
                    
        }
    }
}
