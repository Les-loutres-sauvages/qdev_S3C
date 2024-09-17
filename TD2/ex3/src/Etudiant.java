import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Etudiant {

    private Identite id;
    private Formation formation;
    private Map<String, Collection<Double>> resultats;

    public Etudiant(Identite id, Formation formation) {
        this.id = id;
        this.formation = formation;
        this.resultats = new HashMap<>();
    }

    public Etudiant(String nip, String n, String p, Formation f) {
        this(new Identite(nip, n, p), f);
    }

    public void addNote(String m, double n) {
        /*
        if(!formation.getMatieres().contains(m.toLowerCase())) {
            throw new IllegalArgumentException("La matière " + m + " n'est pas dans la formation.");
            return;
        }
        */

        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("La note doit être comprise entre 0 et 20. (actual: " + n + ")");
            return;
        }

        resultats.computeIfAbsent(m.toLowerCase(), k -> new ArrayList<>()).add(n);
        resultats.get(m.toLowerCase()).add(n);
    }


    public Identite getIdentite() {
        return id;
    }

    public Formation getFormation() {
        return formation;
    }

    public Map<String, Collection<Double>> getResultats() {
        return resultats;
    }
}