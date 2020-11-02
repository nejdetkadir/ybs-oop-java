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
public class Referans {
    public static void main(String[] args) {
        int i=1;
        int j=2;
        i=j;
        i++;
        System.out.println("i: "+i);
        System.out.println("j: "+j);
        
        Cember c1=new Cember(5);
        Cember c2=new Cember(10);
        c1=c2;
        c1.yariCap=25;
        System.out.println("Cember1 in r: "+c1.yariCap);
        System.out.println("Cember2 nin r: "+c2.yariCap);
        
        
        
        
    }
}
