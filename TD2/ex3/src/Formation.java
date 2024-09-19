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

    /**
     * Ajoute la matière à la formation
     * @param mat La matière à ajouter
     * @param coef Le coefficient de la matière
     */
    public void ajouter(String mat, Double coef){
        this.matieres.put(mat, coef);
    }

    /**
     * supprime la matière
     * @param mat la matière à supprimer
     */
    public void supprimer(String mat){
        this.matieres.remove(mat);
    }

    public Double getCoef(String mat) throws Exception{
        Double matiere = this.matieres.get(mat);
        if  (matiere == null){
            throw new IllegalAccessException("La matière n'existe pas");
        } else
            return matiere;
    }

}
