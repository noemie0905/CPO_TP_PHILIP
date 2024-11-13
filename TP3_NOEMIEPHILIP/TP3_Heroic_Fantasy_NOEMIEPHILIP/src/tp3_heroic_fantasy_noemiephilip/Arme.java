package tp3_heroic_fantasy_noemiephilip;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phili
 */
public abstract class Arme {
    String nom;
    int niveau;

    public Arme(String nom, int niveau) {
        this.nom = nom;
        if (niveau<=100){
        this.niveau = niveau;}
        else{this.niveau=100;}
    }

    @Override
    public String toString() {
        return "Arme{" + "nom=" + nom + ", niveau=" + niveau + '}';
    }
  
}
