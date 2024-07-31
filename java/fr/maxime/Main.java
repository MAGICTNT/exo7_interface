package fr.maxime;

import fr.maxime.entity.animaux.Elephant;
import fr.maxime.entity.animaux.EnclosDesElephants;
import fr.maxime.entity.animaux.EnclosDesLions;
import fr.maxime.entity.animaux.Lion;

public class Main {
    public static void main(String[] args) {

        EnclosDesLions enclosDesLions = new EnclosDesLions();
        EnclosDesElephants enclosDesElephants = new EnclosDesElephants();

        Lion lion1 = new Lion("Simba", 5);
        Lion lion2 = new Lion("Nala", 4);
        Elephant elephant1 = new Elephant("Dumbo", 10, 100);
        Elephant elephant2 = new Elephant("Babar", 12, 200);

        enclosDesLions.ajouterAnimal(lion1);
        enclosDesLions.ajouterAnimal(lion2);
        enclosDesElephants.ajouterAnimal(elephant1);
        enclosDesElephants.ajouterAnimal(elephant2);

        System.out.println("Animaux dans l'enclos des lions:");
        enclosDesLions.afficherAnimaux();
        System.out.println("\nAnimaux dans l'enclos des éléphants:");
        enclosDesElephants.afficherAnimaux();
    }
}