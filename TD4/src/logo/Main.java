package logo;

public class Main
{
   
    public static void main(String args[])
    {
        ReneLaTaupe l = new ReneLaTaupe();
        MyImage i = l.getLogo(); 
        
        i.paintOver("img/Chapeau.png", 280,42);
        i.paintOver("img/Sunglasses.png", 255,76);
        i.paintOver("img/Candy.png", 441,202);
        i.paintOver("img/Smiley.png", 260,210);
        
        i.display();  // Permet l'affichage dans une fenetre de l'image associee

        
    }
        
}
