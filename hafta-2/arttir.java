/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta22;

/**
 *
 * @author Zeynep
 */
public class arttir {
    public static void main(String[] args) {
        int x=5;
        System.out.println("x in önceki degeri: "+x);
        arttir(x);
        System.out.println("x in sonraki degeri: "+x);
        
    }
    
    public static void arttir(int n){
        n++;
        System.out.println("x in metot icindeki degeri: "+n);
    }
    
}
