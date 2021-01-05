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
public class Kopek extends Hayvan{

    public Kopek(String isim) {
        super(isim);
    }
    
    @Override
    public String konus(){
        return this.getIsim()+" havlar.";
    }
}
