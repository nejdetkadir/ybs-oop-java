/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafta10;

import Hafta6.Cember;

/**
 *
 * @author Zeynep
 */
public class EqualsMetodu {
    public static void main(String[] args) {
        Object c1=new Cember(10);
        Object c2=new Cember(10);
        c1=c2;
        if(c1==c2){
            System.out.println("c1 ile c2 aynı");
        }
        else{
            System.out.println("c1 ile c2 farklı");
        }
        
        if (c1.equals(c2)){
            System.out.println("c1 ile c2 eşittir");
        }
        else{
            System.out.println("c1 ile c2 eşit değildir");
        }
    }
    
}
