/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_philip;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author phili
 */
public class TP1_stats_PHILIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Random generateurAleat = new Random();
Scanner sc = new Scanner(System.in);
int[] des = new int[6]; // 6 faces, initialisées à 0
System.out.print("Saisissez le nombre de lancers de dé : ");
int m = sc.nextInt();
for (int i = 0; i < m; i++) {
int lancer = generateurAleat.nextInt(6);
des[lancer]++;}
System.out.println("Résultats des lancers (en occurrences) :");
        for (int i = 0; i < des.length; i++) {
            System.out.println("Face " + (i + 1) + ": " + des[i] + " occurrences");
        }
System.out.println("\nRésultats des lancers (en pourcentage) :");
        for (int i = 0; i < des.length; i++) {
            double pourcentage = (double) des[i] / m * 100;
            System.out.printf("Face %d: %.2f%%\n", (i + 1), pourcentage);
        }
        sc.close();

    }
    
}
