package ej;

import java.util.List;
import java.util.ArrayList;

public class Kit {
    private List<Bloc> mesBlocs = new ArrayList<Bloc>();
    private List<String> motsCles = new ArrayList<String>();

    public Kit() {
        Mur murPorteur = new Mur(3, 2,2, Couleur.GRIS, true);
        Mur murNonPorteur = new Mur(2, 1,2, Couleur.GRIS, false);
        Porte maPorte = new Porte(1, 2,2, Couleur.BLEU, true);
        mesBlocs.add(murPorteur);
        mesBlocs.add(murPorteur);
        mesBlocs.add(murNonPorteur);
        mesBlocs.add(murNonPorteur);
        mesBlocs.add(maPorte);

        motsCles.add("Cabane");
        motsCles.add("Muraille");
    }

    public void afficherKit() {
        System.out.println("Nombre de blocs : " + mesBlocs.size());
        System.out.println("Liste des mots-clés : ");
        for(String motCle : motsCles) {
            System.out.println(motCle + " ");
        }
    }
}
