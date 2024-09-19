import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class Groupe {

    private Collection<Etudiant> groupe;
    private final Formation formation;

    public Groupe(Formation f) {
        this.formation = f;
        this.groupe = new ArrayList<>();
    }

    public void ajouter(Etudiant e) {
        if(e.getFormation() != formation) {
            throw new IllegalArgumentException("L'étudiant n'est pas dans la bonne formation.");
        }
        groupe.add(e);
    }

    public void supprimer(Etudiant e) {
        groupe.remove(e);
    }

    public String toString() {
        String res = "Groupe{groupe=[";

        for(Etudiant e : groupe) {
            res += e.toString() + ", ";
        }
        return res;
    }
}
