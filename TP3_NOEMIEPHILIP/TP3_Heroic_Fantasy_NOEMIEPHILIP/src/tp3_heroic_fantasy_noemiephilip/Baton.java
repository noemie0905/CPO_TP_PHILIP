/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_noemiephilip;

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
}
