/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_noemiephilip;

/**
 *
 * @author phili
 */
public class TP2_bieres_NOEMIEPHILIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere() ; 
        uneBiere.Nom = "Cuvée des trolls"; 
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.brasserie="Dubuisson";
        uneBiere.ouverte=false;
        uneBiere.lireEtiquette(); 

    
        BouteilleBiere secondeBiere = new BouteilleBiere() ; 
        secondeBiere.Nom = "Leffe"; 
        secondeBiere.degreAlcool = 6.6 ;
        secondeBiere.brasserie="Abbaye de Leffe";
        secondeBiere.ouverte=false;
        secondeBiere.lireEtiquette(); 
    }
}
