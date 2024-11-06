/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_noemiephilip;

/**
 *
 * @author phili
 */
public class TP2_manip_NOEMIEPHILIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Tartiflette assiette1 = new Tartiflette(500);
Tartiflette assiette2 = new Tartiflette(600);
Tartiflette assiette3 = assiette2 ;  

System.out.println("nb de calories de Assiette 2 : " + 
assiette2.nbCalories) ; 
System.out.println("nb de calories de Assiette 3 : " + 
assiette3.nbCalories) ; 

Tartiflette temp = assiette1;
assiette1 = assiette2;
assiette2 = temp;

//Moussaka assiette666 = assiette1 ; 
//Moussaka assiette667 = new Tartiflette() ; 
// pas correct car assiette1 est de type tartiflette et pas correct car mussaka et tartiflette sont 2 types distincts

Moussaka[] tableauMoussaka = new Moussaka[10];
for (int i = 0; i < tableauMoussaka.length; i++) {
    tableauMoussaka[i] = new Moussaka(200); // Exemple avec 200 calories
}

    }
    
}
