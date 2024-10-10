package ex2_4;


import logo.MyImage;

public class Rene {
	/**
     * Chemin d'acces au fichier
     * contenant l'image de fond du logo
     */
    private String nomIm;
    
    /**
     * Prix du logo
     */
    private static final double prix = 3.65;
    
    /**
     * Constructeur
     */
    public Rene() {
        nomIm = "img/Taupe.jpg";
    }
    
    /**
     * @return l'objet de MyImage correspondant a nomIm
     */
    public MyImage getLogo(){
        return new MyImage(nomIm);
    }
    
    /**
     * @return le prix du logo
     */
    public double combienCaCoute(){
        return prix;
    }
}
