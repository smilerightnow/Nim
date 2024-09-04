package controller;

import model.*;
import view.*;

public class Controller {
    private Ihm ihm;
    private Joueur j1;
    private Joueur j2;
    private Tas partie;

    public Controller(Ihm ihm){
        this.ihm = ihm;
        this.partie = new Tas();
        this.j1 = new Joueur();
        this.j2 = new Joueur();
    }

    public void start(){
        j1.nom = ihm.demanderNomJoueur(1);
        j2.nom = ihm.demanderNomJoueur(2);

        partie.nbTas = ihm.demanderNbTas();
        partie.nbTasRestants = partie.nbTas;

        int le_tour_de = 1;
        Joueur last_player = new Joueur();

        while(partie.nbTasRestants>1){
            int taken = ihm.demanderCoup(le_tour_de);
            if (le_tour_de == 1){
                partie.nbTasTakenJ1 += taken;
                partie.nbTasRestants -= taken;
                le_tour_de++;
                last_player = j1;
            } else {
                partie.nbTasTakenJ2 += taken;
                partie.nbTasRestants -= taken;
                le_tour_de--;
                last_player = j2;
            }
            ihm.afficherEtat(partie.nbTasRestants, partie.nbTasTakenJ1, partie.nbTasTakenJ2);
        }
        ihm.afficherVainqeueur(last_player);

        String rejouer = ihm.demanderRejouer();
        if(rejouer.equals("o")){
            this.start();
        }
    }
}
