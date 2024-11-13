/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_noemiephilip;

import Armes.Epee;
import Armes.Baton;
import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author phili
 */
public class TP3_Heroic_Fantasy_NOEMIEPHILIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee Epee1=new Epee(7,"Excalibur",5);
        Epee Epee2=new Epee(4,"Durandal",7);
        Baton Baton1=new Baton(4,"Chene",5);
        Baton Baton2=new Baton(5,"Charme",6);

        System.out.println(Epee1);
        System.out.println(Epee2);
        System.out.println(Baton1);
        System.out.println(Baton2);
        
ArrayList<Arme> tab= new ArrayList<Arme>();
tab.add(Epee1);
tab.add(Epee2);
tab.add(Baton1);
tab.add(Baton2);

for (int i=0; i<tab.size()-1; i++) {
    System.out.println(tab.get(i)+", ");
}
System.out.print(tab.get(tab.size()-1));
    }  
}
