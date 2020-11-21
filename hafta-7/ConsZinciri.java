/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hafta7;

/**
 *
 * @author Zeynep
 */
public class ConsZinciri {
    public static void main(String[] args) {
        new Akademisyen();
    }
}



class Calisan extends Insan{

    public Calisan() {
        this("2-Çalısan sınıfının parametreli cons. çağrıldı.");
        System.out.println("3-Çalısan sınıfının parametresiz cons. çağrıldı.");
    }
    public Calisan(String s) {
        System.out.println(s);
    }
}

class Akademisyen extends Calisan{

    public Akademisyen() {
        System.out.println("4-Akademisyen sınıfı cons. çağırıldı.");
    }
    
}

class Insan{
    public Insan() {
        System.out.println("1-Insan sınıfının cons. çağırıldı.");
    }
 }