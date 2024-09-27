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
    System.out.println("Bonjour, saisissez une valeur:");
    double valeur=sc.nextDouble();
    System.out.println("saisissez la conversion que vous souhaitez effectuer:");
    System.out.println("1) De Celcius vers Kelvin");
    System.out.println("2) De Kelvin vers Celcius");
    System.out.println("3) De Farenheit vers Celcius");
    System.out.println("4) De Celcius vers Farenheit");
    System.out.println("5) De Kelvin vers Farenheit");
    System.out.println("6) De Farenheit vers Kelvin");
    int choix=sc.nextInt();
    
    if (choix==1){System.out.println(valeur+" degres celcius est egal a "+CelciusVersKelvin(valeur)+" degres Kelvin");}
    if (choix==2){System.out.println(valeur+" degres kelvin est egal a "+KelvinVersCelcius(valeur)+" degres celcius");}
    if (choix==3){System.out.println(valeur+" degres Farenheit est egal a "+FarenheitVersCelcius(valeur)+" degres celcius");}
    if (choix==4){System.out.println(valeur+" degres Celcius est egal a "+CelciusVersFarenheit(valeur)+" degres Farenheit");}
    if (choix==5){System.out.println(valeur+" degres Kelvin est egal a "+KelvinVersFarenheit(valeur)+" degres Farenheit");}
    if (choix==6){System.out.println(valeur+" degres Farenheit est egal a "+FarenheitVersKelvin(valeur)+" degres Kelvin");}

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
    double tKelvin=CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
        return tKelvin;
}}
