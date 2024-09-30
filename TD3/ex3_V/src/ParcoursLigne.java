public class ParcoursLigne extends Parcours{

    public ParcoursLigne(TableauEntier tableau) {
        super(tableau);
    }

    @Override
    public int suivant() {
        if (colonneCour < tab.getLargeur()){
            colonneCour++;
            nbParcours ++;
            return tab.valeurA(ligneCour, colonneCour-1);
        } else{
            if (hasNext()){
                ligneCour ++;
                colonneCour = 0;
                return suivant();
            }
        }
        return -1;
    }

    @Override
    public boolean hasNext() {
        return (nbParcours < tab.getLargeur() * tab.getHauteur());
    }

    public int getColonneCour() {
        return colonneCour-1;
    }
}
