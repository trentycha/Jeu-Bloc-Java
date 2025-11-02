package ej;

public class Mur extends Bloc {
    protected boolean porteur;
    Couleur murGris;

    public Mur(int largeur, int longueur, int hauteur, Couleur couleur, boolean porteur) {
        super(largeur, longueur, hauteur, couleur);
        this.murGris = Couleur.GRIS;
        this.porteur = porteur;
    }

    public boolean estTraversable() {
        return !this.porteur;
    }
}