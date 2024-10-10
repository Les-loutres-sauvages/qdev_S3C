public class ParcoursZigZag extends Parcours{

    private boolean droite = true;

    public ParcoursZigZag(TableauEntier tableau) {
        super(tableau);
    }

    @Override
    public int suivant() {
        if (droite){
            if (colonneCour < tab.getLargeur()){
                colonneCour++;
                nbParcours ++;
                return tab.valeurA(ligneCour, colonneCour-1);
            } else{
                if (hasNext()){
                    ligneCour ++;
                    droite = false;
                    return suivant();
                }
            }
        } else{
            if (colonneCour > 0){
                colonneCour--;
                nbParcours ++;
                return tab.valeurA(ligneCour, colonneCour);
            } else{
                if (hasNext()){
                    ligneCour ++;
                    colonneCour = 0;
                    droite = true;
                    return suivant();
                }
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
