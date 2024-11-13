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
public class Baton extends Arme {
    int Age;

    public Baton(int Age, String nom, int niveau) {
        super(nom, niveau);
        if (Age<100){this.Age = Age;}
        else{Age=99;}
    }  

    @Override
    public String toString() {
        return "Baton{nom=" + nom + ", niveau=" + niveau + ", Age=" + Age + '}';
    }
    
}
