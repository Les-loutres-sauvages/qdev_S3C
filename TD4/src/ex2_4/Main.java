package ex2_4;

import logo.MyImage;

public class Main
{
   
    public static void main(String args[])
    {
        Rene taupe = new Chapeau(new Lunette(new Rene()));
        MyImage i = taupe.getLogo();
        double prix = taupe.combienCaCoute();
        System.out.println("Prix du logo : " + prix);
        i.display();  // Permet l'affichage dans une fenetre de l'image associee
    }
        
}
