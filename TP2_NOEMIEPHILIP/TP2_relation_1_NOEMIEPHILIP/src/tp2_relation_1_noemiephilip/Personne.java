package tp2_relation_1_noemiephilip;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author phili
 */
public class Personne {    
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbVoitures = 0;
        this.liste_voitures = new Voiture[3]; // initialise le tableau de voitures pour 3 voitures max
    }

    @Override
    public String toString() {
        return "Personne{" + "nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + '}';
    }
}

    
}
