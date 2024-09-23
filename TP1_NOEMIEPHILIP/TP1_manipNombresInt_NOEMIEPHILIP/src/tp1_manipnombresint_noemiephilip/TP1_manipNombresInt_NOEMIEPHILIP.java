/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_noemiephilip;

import java.util.Scanner;

/**
 *
 * @author phili
 */
public class TP1_manipNombresInt_NOEMIEPHILIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 //pour installer la fonction
 System.out.println("\n Entrez deux entiers :");
 //pour demander à l'utilisateur d'entrer deux entiers
 int nb1=sc.nextInt();
 int nb2=sc.nextInt();
 // création des variables et stockage des variables pour les additionner
 int resultatsomme=nb1+nb2;
 int resultatdiff=nb1-nb2;
 int resultatprod=nb1*nb2;
 System.out.println("la somme de ces chiffres est "+resultatsomme);
  System.out.println("la difference de ces chiffres est "+resultatdiff);
  System.out.println("le produit de ces chiffres est "+resultatprod);
int resultatquotient=nb1/nb2;
int resultatreste=nb1%nb2;
 System.out.println("le quotient entier de ces chiffres est "+resultatquotient+" et le reste est "+resultatreste);
 

         }
    
}
