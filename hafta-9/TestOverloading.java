/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafta9;

/**
 *
 * @author Zeynep
 */
public class TestOverloading {
    public static void main(String[] args) {
        AA a=new AA();
        a.p(10);
        a.p(10.0);
    }
}

class BB{
   public void p(double i){
       System.out.println(i*2);
   } 
}
 class AA extends BB{
     public void p(int i){
         System.out.println(i);
     }
 }

