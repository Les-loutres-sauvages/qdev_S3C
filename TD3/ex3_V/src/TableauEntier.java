public class TableauEntier {
    protected int[][] tab;

    /**
     * encapsule le tableau passé en paramètre.
     *
     * @param t
     */
    public TableauEntier(int[][] t) {
        this.tab = t;
    }


    /**
     * retourne l’élément ligne l et colonne c.
     *
     * @param l
     * @param c
     * @return
     */
    public int valeurA(int l, int c) {
        return tab[l][c];
    }

    /**
     * retourne le nombre de colonnes du tableau.
     *
     * @return
     */
    public int getLargeur() {
        return tab[0].length;
    }


    /**
     * retourne le nombre de lignes du tableau
     *
     * @return
     */
    public int getHauteur() {
        return tab.length;
    }

    public ParcoursLigne iterateurLigne(){
        return new ParcoursLigne(this);
    }
}

