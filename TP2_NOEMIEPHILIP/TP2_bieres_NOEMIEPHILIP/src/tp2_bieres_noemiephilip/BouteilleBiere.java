/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_noemiephilip;

/**
 *
 * @author phili
 */
public class BouteilleBiere { String Nom; double degreAlcool; String brasserie; Boolean ouverte;
public void lireEtiquette() { 
System.out.println("Bouteille de " + Nom +" (" + degreAlcool + 
" degres) \nBrasserie : " + brasserie ) ; 
}


public BouteilleBiere(String unNom, double unDegre, String uneBrasserie){
Nom = unNom; 
degreAlcool = unDegre; 
brasserie = uneBrasserie; 
ouverte = false; }

public boolean Decapsuler() {
        if (!ouverte) {
            ouverte = true; 
            return true; 
        } else {
            System.out.println("Erreur : biere deja ouverte.");
            return false; 
        }
    }

@Override 
public String toString() { 
String chaine_a_retourner; 
chaine_a_retourner = Nom + " (" + degreAlcool + " degres) Ouverte ? ";   
if (ouverte == true ) chaine_a_retourner += "oui" ; 
else chaine_a_retourner += "non" ; 
return chaine_a_retourner ;  
}}