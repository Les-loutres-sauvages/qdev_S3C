import java.util.*;

public class Groupe{

    private ArrayList<Etudiant> groupe;
    private final Formation formation;

    public Groupe(Formation f) {
        this.formation = f;
        this.groupe = new ArrayList<Etudiant>();
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
        int i = 0;
        for(Etudiant e : groupe) {
            if (i == 0) {
                res += e.toString();
                i++;
            }
            else
                res += ", " + e.toString() ;
        }
        res += "]";
        return res;
    }

    public double getMoyenneGroupe(String m) throws Exception {
        if (!formation.matiereExist(m.toLowerCase())) {
            throw new IllegalArgumentException("La matière " + m + " n'est pas dans la formation.");
        }

        double somme = 0;
        for (Etudiant e : groupe) {
            somme += e.getMoyenne(m);
        }

        return (somme / groupe.size());
    }

    public double getMoyenneGeneraleGroupe() throws Exception {
        double somme = 0;
        for (Etudiant e : groupe) {
            somme += e.getMoyenneGenerale();
        }

        return (somme / groupe.size());
    }

    /**
     * c. Ajouter dans la classe Groupe
     * - la méthode triAlpha qui permet de trier la liste des étudiants du groupe selon l'ordre
     * alphabétique de leur nom (de A vers Z).

     */
    public void triAlpha(){
        Collections.sort(groupe);
    }

    /**
     * - la méthode triAntiAlpha qui permet de trier la liste des étudiants du groupe dans
     * l'ordre inverse de l'ordre alphabétique (de Z vers A).
     */
    public void triAntiAlpha(){
        Collections.sort(groupe, Collections.reverseOrder());
    }

    /**
     * - la méthode triMerite qui permet de trier la liste des étudiants du groupe en fonction de
     * leur moyenne générale (DESC)
     */
    public void TriParMerite() {
        Collections.sort(groupe, new Comparator<Etudiant>() {

            @Override
            public int compare(Etudiant e1, Etudiant e2) {
                return Double.compare(e2.getMoyenneGenerale(), e1.getMoyenneGenerale());
            }
        });
    }
}

