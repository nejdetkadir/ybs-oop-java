/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafta10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Zeynep
 */
public class TekrarEtmeyenElemanlar {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Sayilari giriniz (Cıkmak için 0'a basınız): ");
        ArrayList<Integer> liste=new ArrayList<>();
        
        while(true){
            Integer sayi=klavye.nextInt();
            if(sayi==0){
                break;
            }
            if(!liste.contains(sayi)){
                liste.add(sayi);
            }
            
        }
        for(Integer sayi:liste){
            System.out.print(sayi+" ");
        }
        
        
    }
}
