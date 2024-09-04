package view;

import model.Joueur;

import java.util.Scanner;

public class Ihm {
    Scanner sc = new Scanner(System.in);

    public String demanderNomJoueur(int num){
        System.out.println("------");
        System.out.println("Bienvenue au jeu de Nim!");
        System.out.println("Saisir le nom du joueur " + num + ":");
        return sc.nextLine();
    }

    public int demanderNbTas(){
        System.out.println("Saisir le nombre des tas:");
        boolean fini = false;
        int num = 0;
        while(!fini){
            try{
                num = Integer.parseInt(sc.nextLine());
                if (num <4 ) System.out.println("Il faut saisir un nombre > 3");
                else fini = true;
            } catch (NumberFormatException e) {
                System.out.println("Il faut saisir un nombre!");
            }
        }
        return num;
    }

    public int demanderCoup(int numJ){
        System.out.println("Joueur "+numJ+", c'est ton tour. Combien to take ?");
        boolean fini = false;
        int num = 0;
        while(!fini){
            try{
                num = Integer.parseInt(sc.nextLine());
                if (num != 1 && num != 2 && num != 3 ) System.out.println("Il faut saisir 1 ou 2 ou 3");
                else fini = true;
            } catch (NumberFormatException e) {
                System.out.println("Il faut saisir un nombre!");
            }
        }
        return num;
    }

    public String demanderRejouer(){
        System.out.println("Rejouer ? O/N");
        boolean fini = false;
        String rep = "";
        while(!fini){
            rep = sc.nextLine().toLowerCase();
            if (!rep.equals("o") && !rep.equals("n")) System.out.println("Il faut saisir un 'O' ou 'N'");
            else fini = true;
        }
        return rep;
    }

    public void afficherEtat(int nbTasRestants, int nbTasTakenJ1, int nbTasTakenJ2){
        System.out.println("------");
        System.out.println("Nombre de Tas restants: "+nbTasRestants);
        System.out.println("Joueur 1 a: "+nbTasTakenJ1+"\n"+"Joueur 2 a: "+nbTasTakenJ2);
        System.out.println("------");
    }

    public void afficherVainqeueur(Joueur J){
        System.out.println("Joueur "+J.nom+" a gagné!");
    }

}
