package tp2_convertisseurobjet_noemiephilip;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phili
 */
public class Convertisseur { int nbConversions;
    
public Convertisseur(){
        nbConversions = 0;
    }
    
    public double CelciusVersKelvin (double tCelcius) {
double tKelvin=tCelcius+273;
nbConversions+=1;
return tKelvin;
}
public double KelvinVersCelcius (double tKelvin) {
double tCelcius=tKelvin-273;
nbConversions+=1;
return tCelcius;
}
public double FarenheitVersCelcius(double tFarenheit){
    double tCelcius=(tFarenheit-32)/1.8;
    nbConversions+=1;
    return tCelcius;
}
public double CelciusVersFarenheit(double tCelcius){
    double tFarenheit=(tCelcius*1.8)+32;
    nbConversions+=1;
    return tFarenheit;    
}
public double KelvinVersFarenheit(double tKelvin){
    double tFarenheit=CelciusVersFarenheit(KelvinVersCelcius(tKelvin));
    return tFarenheit;
}
public double FarenheitVersKelvin(double tFarenheit){
    double tKelvin=CelciusVersKelvin(FarenheitVersCelcius(tFarenheit));
        return tKelvin;
}
    @Override 
public String toString () { 
return "nb de conversions"+ nbConversions; 
}
}
