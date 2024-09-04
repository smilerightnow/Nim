package model;

public class Joueur {
    public String nom;
    public int NbPartiesGagnees;

    public int getNbPartiesGagnees() {
        return NbPartiesGagnees;
    }

    public void incNbPartiesGagnees(int nbPartiesGagnees) {
        NbPartiesGagnees += 1;
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
}
