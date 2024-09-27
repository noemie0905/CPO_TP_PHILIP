/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_philip;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author phili
 */
public class TP1_guessMyNumber_PHILIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random generateurAleat = new Random();
       /* int n = generateurAleat.nextInt(100);
        int b = generateurAleat.nextInt(100);
        int c = generateurAleat.nextInt(100);
        int d = generateurAleat.nextInt(100);
        int e = generateurAleat.nextInt(100);
        System.out.println(n);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
*/
    int a = generateurAleat.nextInt(100);
    Scanner sc = new Scanner(System.in);
    System.out.println("saisissez une valeur entre 1 et 100");
    int b = sc.nextInt();
    int nbtent=0;
    while (a!=b){
    if (b>a){System.out.println("trop grand");}
    if (b<a){System.out.println("trop petit");}
    nbtent++; b=sc.nextInt();}
    if (a==b){System.out.println("gagne");
    System.out.println("vous avez gagne en "+nbtent);}
    
    }  
}
