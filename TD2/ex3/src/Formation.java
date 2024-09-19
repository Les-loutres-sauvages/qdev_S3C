import java.util.HashMap;
import java.util.Map;

public class Formation {

    /**
     * id de la formation
     */
    private int id;
    /**
     * Nom de la matière et son coefficient
     */
    private Map<String, Double> matieres;

    public Formation(int id, Map<String, Double> matieres) {
        this.id = id;
        this.matieres = matieres;
    }

    public Formation(int id) {
        this.id = id;
        this.matieres = new HashMap<String, Double>();
    }
    /**
     * Ajoute la matière à la formation
     * @param mat La matière à ajouter
     * @param coef Le coefficient de la matière
     */
    public void ajouter(String mat, Double coef){
        this.matieres.put(mat.toLowerCase(), coef);
    }

    /**
     * supprime la matière
     * @param mat la matière à supprimer
     */
    public void supprimer(String mat){
        this.matieres.remove(mat);
    }

    /**
     * Récupère le coefficient de la matière
     * @param mat La matière
     * @return Le coefficient de la matière
     * @throws Exception Si la matière n'existe pas
     */
    public Double getCoef(String mat) throws Exception{
        Double matiere = this.matieres.get(mat);
        if  (matiere == null){
            throw new IllegalAccessException("La matière n'existe pas");
        } else
            return matiere;
    }

    /**
     * Vérifie si la matière existe
     * @param mat La matière
     * @return true si la matière existe, false sinon
     */
    public boolean matiereExist(String mat){
        return matieres.containsKey(mat);
    }

}
