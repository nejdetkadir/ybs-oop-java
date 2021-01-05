/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafta10;

/**
 *
 * @author Zeynep
 */
public class Test11s23 {

    public static void main(String[] args) {
        //new AA();
        new BB();
    }
}

class AA {

    int i = 7;

    public AA() {
        setI(20);
        System.out.println("i from A is " + i);
    }

    public void setI(int i) {
        this.i = 2 * i;
    }
}

class BB extends AA {

    public BB() {
        System.out.println("i from B is " + i);
    }

    public void setI(int i) {
        this.i = 3 * i;
    }
}
