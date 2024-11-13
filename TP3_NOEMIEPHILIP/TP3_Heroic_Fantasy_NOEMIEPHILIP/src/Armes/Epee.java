/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author phili
 */
public class Epee extends Arme {
    int indice;

    public Epee(int indice, String nom, int niveau) {
        super(nom, niveau);
        if(indice<100){
        this.indice = indice;}
        else{indice=99;}
    }

    @Override
    public String toString() {
        return "Epee{nom=" + nom + ", niveau=" + niveau + ", indice=" + indice + '}';
    }
    
}

    
    

