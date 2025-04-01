package fr.starfleet;

import fr.starfleet.modele.vaisseau.Vaisseau;

public class Main2 {
    public static void main(String[] args) {
        // Création d'un vaisseau
        Vaisseau enterprise = new Vaisseau("USS Enterprise", "NCC-1701", 500, "Jean-Luc Picard");

        // Affichage des infos du vaisseau
        System.out.println(enterprise.getDescription());
    }
}
