/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo3;

import static java.awt.AWTEventMulticaster.add;
import java.util.Scanner;

/**
 *
 * @author phili
 */
public class Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Please enter the operator:");
        System.out.println(" 1) add");
        System.out.println(" 2) substract");
        System.out.println(" 3) multiply");
        System.out.println(" 4) devide");
        System.out.println(" 5) modulo");
       int operateur;
       int operande1;
       int operande2;
       int result;
       Scanner sc = new Scanner(System.in);
       System.out.println("Choisissez une de ces operations :");
       operateur=sc.nextInt();
       System.out.println("Choisissez un premier chiffre");
       operande1=sc.nextInt();
       System.out.println("Choisissez un deuxieme chiffre");
       operande2=sc.nextInt();
       if (operateur==1) {
           result=operande1+operande2;
           System.out.println("le resultat est "+result);
        }
       else if (operateur==2) {
            result=operande1-operande2;
            System.out.println("le resultat est "+result);        
        }
       else if (operateur==3) {
           result=operande1*operande2;
           System.out.println("le resultat est "+result);
        }
       else if (operateur==4) {
           result=operande1/operande2;
           System.out.println("le resultat est "+result);
        }
       else if (operateur==1) {
           result=operande1+operande2;
           System.out.println("le resultat est "+result);
        }
       else {
           System.out.println("Choisissez un premier chiffre entre 1 et 5 stp");
        }
    }
}
