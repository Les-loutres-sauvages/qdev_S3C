import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Etudiant {

    /**
     * Numéro d’Identification Personnel
     */
    private Identite nip;
    private Formation formation;
    private Map<String, Collection<Double>> resultats;

    /**
     * @param nip Identité de l'étudiant
     * @param formation Formation de l'étudiant
     */
    public Etudiant(Identite nip, Formation formation) {
        /**
         * Numéro d’Identification Personnel
         */
        this.nip = nip;
        this.formation = formation;
        this.resultats = new HashMap<>();
    }

    /**
     * @param nip NIP (Numéro d’Identification Personnel)
     * @param n Nom
     * @param p Prénom
     * @param f Formation de l'étudiant
     */
    public Etudiant(String nip, String n, String p, Formation f) {
        this(new Identite(nip, n, p), f);
    }

    /**
     * Méthode pour ajouter une note à un étudiant dans une matière donnée
     *
     * @param m Matière
     * @param n Note
     */
    public void addNote(String m, double n) {
        /*
        if(!formation.getMatieres().contains(m.toLowerCase())) {
            throw new IllegalArgumentException("La matière " + m + " n'est pas dans la formation.");
        }
        */

        if(n < 0 || n > 20) {
            throw new IllegalArgumentException("La note doit être comprise entre 0 et 20. (actual: " + n + ")");
        }

        resultats.computeIfAbsent(m.toLowerCase(), k -> new ArrayList<>()).add(n);
        resultats.get(m.toLowerCase()).add(n);
    }


    public Identite getIdentite() {
        return nip;
    }

    public Formation getFormation() {
        return formation;
    }

    public Map<String, Collection<Double>> getResultats() {
        return resultats;
    }
}