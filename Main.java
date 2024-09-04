import controller.*;
import view.*;

public class Main {

    public static void main(String[] args){
        Ihm ihm = new Ihm();
        Controller Jeu = new Controller(ihm);

        Jeu.start();
    }
}
