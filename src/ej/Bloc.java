package ej;

public abstract class Bloc {
    protected int longueur;
    protected int largeur;
    protected int hauteur;
    protected Couleur couleur;

    public Bloc(int longueur, int largeur, int hauteur, Couleur couleur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.couleur = couleur;
    }

    public int getLongueur() {
        return this.longueur;
    }

    public int getLargeur() {
        return this.largeur;
    }

    public int getHauteur() {
        return this.hauteur;
    }

    public Couleur getCouleur() {
        return this.couleur;
    }
}