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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 
    7.0 ,"Dubuisson"); 
        uneBiere.lireEtiquette();
    
        BouteilleBiere secondeBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe") ; 
        secondeBiere.lireEtiquette();
        
        BouteilleBiere troisiemeBiere= new BouteilleBiere("Jupiler",5.9,"Jupiler");
        troisiemeBiere.lireEtiquette();
        
        uneBiere.Decapsuler();
        uneBiere.Decapsuler();

        System.out.println(secondeBiere) ; 
    
    }
}
   

