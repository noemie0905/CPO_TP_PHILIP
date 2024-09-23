/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_noemiephilip;

import java.util.Scanner;

/**
 *
 * @author phili
 */
public class TP1_convertisseur_NOEMIEPHILIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("entrez une temperature en degre celcius");
    double valeur=sc.nextDouble();
    System.out.println(valeur+"C");
    System.out.println(CelciusVersKelvin(valeur)+" K");

    
    
    }
    


public  static double CelciusVersKelvin (double tCelcius) {
double tKelvin=tCelcius+273;
return tKelvin;
}
public  static double KelvinVersCelcius (double tKelvin) {
double tCelcius=tKelvin-273;
return tCelcius;
}
public static double FarenheitVersCelcius(double tFarenheit){
    double tCelcius=(tFarenheit-32)/1.8;
    return tCelcius;
}
public static double CelciusVersFarenheit(double tCelcius){
    double tFarenheit=(tCelcius*1.8)+32;
    return tFarenheit;    
}
public static double KelvinVersFarenheit(double tKelvin){
    double tFarenheit=CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    return tFarenheit;
}
public static double FarenheitVersKelvin(double tFarenheit){
    double tKelvin=CelciusVersKelvin()
}
}