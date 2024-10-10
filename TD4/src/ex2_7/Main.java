package ex2_7;

import logo.MyImage;

public class Main {

    public static void main(String args[]) {
        Logo taupe = new Chapeau(new Lunette(new Rene()));
        Logo frog = new Chapeau(new Lunette(new Frog()));

        MyImage i = taupe.getLogo();
        MyImage i2 = frog.getLogo();

        double prix = taupe.combienCaCoute();
        double prix2 = frog.combienCaCoute();

        System.out.println("Prix du logo taupe : " + prix);
        System.out.println("Prix du logo frog : " + prix2);

        i2.display();  // Permet l'affichage dans une fenetre de l'image associee
    }

}
