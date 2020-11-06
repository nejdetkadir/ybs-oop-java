/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import p1.C1;

public class C3 {
    public static void main(String[] args) {
        C1 o = new C1();
        o.x=1;  //public
        o.y=2;  //default - ulaşılamıyor
        o.z=3; //  ulaşılamıyor
        o.m1();  //public
        o.m2();  //default   //  ulaşılamıyor
        o.m3();   //  ulaşılamıyor
    }
 
}
