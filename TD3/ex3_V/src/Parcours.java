import java.util.Iterator;

public abstract class Parcours implements Iterator<Integer> {

    protected TableauEntier tab;
    protected int ligneCour = 0, colonneCour = 0, nbParcours = 0;

    public Parcours(TableauEntier tableau){
        this.tab = tableau;
    }

    @Override
    public Integer next(){
        return suivant();
    }

    public abstract int suivant();


    public int getColonneCour() {
        return colonneCour;
    }

    public int getLigneCour() {
        return ligneCour;
    }
}
