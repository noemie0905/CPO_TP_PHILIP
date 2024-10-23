/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_noemiephilip;

import java.util.Scanner;

/**
 *
 * @author phili
 */
public class TP2_convertisseurObjet_NOEMIEPHILIP {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Convertisseur convertisseur = new Convertisseur();

        boolean continuer = true;

        while (continuer) {
            System.out.println("Choisissez une conversion :");
            System.out.println("1. Celsius vers Kelvin");
            System.out.println("2. Kelvin vers Celsius");
            System.out.println("3. Fahrenheit vers Celsius");
            System.out.println("4. Celsius vers Fahrenheit");
            System.out.println("5. Kelvin vers Fahrenheit");
            System.out.println("6. Fahrenheit vers Kelvin");
            System.out.println("7. Quitter");
            System.out.print("Votre choix : ");
            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Entrez la température en Celsius : ");
                    double tCelsius = scanner.nextDouble();
                    double tKelvin = convertisseur.CelciusVersKelvin(tCelsius);
                    System.out.printf("%.2f °C = %.2f K\n", tCelsius, tKelvin);
                    break;
                case 2:
                    System.out.print("Entrez la température en Kelvin : ");
                    double tKelvinInput = scanner.nextDouble();
                    double tCelsiusResult = convertisseur.KelvinVersCelcius(tKelvinInput);
                    System.out.printf("%.2f K = %.2f °C\n", tKelvinInput, tCelsiusResult);
                    break;
                case 3:
                    System.out.print("Entrez la température en Fahrenheit : ");
                    double tFahrenheit = scanner.nextDouble();
                    double tCelsiusFromF = convertisseur.FarenheitVersCelcius(tFahrenheit);
                    System.out.printf("%.2f °F = %.2f °C\n", tFahrenheit, tCelsiusFromF);
                    break;
                case 4:
                    System.out.print("Entrez la température en Celsius : ");
                    double tCelsiusToF = scanner.nextDouble();
                    double tFahrenheitResult = convertisseur.CelciusVersFarenheit(tCelsiusToF);
                    System.out.printf("%.2f °C = %.2f °F\n", tCelsiusToF, tFahrenheitResult);
                    break;
                case 5:
                    System.out.print("Entrez la température en Kelvin : ");
                    double tKelvinToF = scanner.nextDouble();
                    double tFahrenheitFromK = convertisseur.KelvinVersFarenheit(tKelvinToF);
                    System.out.printf("%.2f K = %.2f °F\n", tKelvinToF, tFahrenheitFromK);
                    break;
                case 6:
                    System.out.print("Entrez la température en Fahrenheit : ");
                    double tFahrenheitToK = scanner.nextDouble();
                    double tKelvinFromF = convertisseur.FarenheitVersKelvin(tFahrenheitToK);
                    System.out.printf("%.2f °F = %.2f K\n", tFahrenheitToK, tKelvinFromF);
                    break;
                case 7:
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }

        System.out.println("Conversions effectuées : " + convertisseur);
        scanner.close();
    }       
    
    
}
