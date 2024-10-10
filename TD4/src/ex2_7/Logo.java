package ex2_7;

import logo.MyImage;

public abstract class Logo {
    /**
     * Chemin d'acces au fichier
     * contenant l'image de fond du logo
     */
    protected String nomIm;

    /**
     * Prix du logo
     */
    protected static double prix;

    /**
     * @return l'objet de MyImage correspondant a nomIm
     */
    public logo.MyImage getLogo() {
        return new MyImage(nomIm);
    }

    /**
     * @return le prix du logo
     */
    public double combienCaCoute() {
        return prix;
    }
}

