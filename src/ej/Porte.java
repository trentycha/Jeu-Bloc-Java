package ej;

public class Porte extends Bloc {
    public boolean verrouille;
    Couleur porteBleue;

    public Porte(int largeur, int longueur, int hauteur, Couleur couleur, boolean verrouille) {
        super(longueur, longueur, hauteur, couleur);
        this.porteBleue = Couleur.BLEU;
        this.verrouille = verrouille;
    }

    public boolean estVerrouillee() {
        return this.verrouille;
    }
}