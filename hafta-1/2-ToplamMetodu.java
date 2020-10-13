/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zozer
 */
public class ToplamMetodu {
    static int toplam(int sayi1, int sayi2) 
	{
		int toplam = 0;
		for (int i = sayi1; i <= sayi2; i++) {
			toplam += i;
		}
		return toplam;
	}

    public static void main(String[] args) {
        int toplam=toplam(1,10);
        System.out.println(" 1 den 10 a kadar olan sayilarin toplami: " + toplam);
        toplam=toplam(20,37);
        System.out.println("20 den 37 ye kadar olan sayilarin toplami: " + toplam);
        toplam=toplam(35,49);
        System.out.println("35 den 49 a kadar olan sayilarin toplami: " + toplam);
        
    }

}
