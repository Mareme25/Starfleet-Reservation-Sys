package fr.starfleet;

import fr.starfleet.modele.personne.Officier;
import fr.starfleet.modele.personne.Civil;

public class Main {
    public static void main(String[] args) {
        Officier officier = new Officier("Picard", "Jean-Luc", "SF123", "Capitaine", "Commandement");
        Civil civil = new Civil("Doe", "John", "CIV456", "Terre", "Tourisme spatial");

        System.out.println(officier.getNom() + " - " + officier.getDescription());
        System.out.println(civil.getNom() + " - " + civil.getDescription());
    }
}
