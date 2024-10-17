import java.util.HashMap;
import java.util.Map;

public class Simulateur {

    protected FabriqueIntersection fabrique;

    public Simulateur(FabriqueIntersection fab){
        this.fabrique = fab;
    }

    /**
     * Génère 100 véhicules et retourne un tableau de stats 4 éléments
     * [nbVoiture, nbBus, nbBicyclette, nbPieton]
     * @return
     */
    public Map<String, Integer> genererStats(){
        Map<String, Integer> stats = new HashMap<>();
        stats.put("Voiture", 0);
        stats.put("Bus", 0);
        stats.put("Bicyclette", 0);
        stats.put("Pieton", 0);
        for (int i = 0; i < 100; i++) {
            Vehicule v = fabrique.creerVehicule();
            if (v instanceof Voiture) {
                stats.put("Voiture", stats.get("Voiture") + 1);
            } else if (v instanceof Bus) {
                stats.put("Bus", stats.get("Bus") + 1);
            } else if (v instanceof Bicyclette) {
                stats.put("Bicyclette", stats.get("Bicyclette") + 1);
            } else if (v instanceof Pieton) {
                stats.put("Pieton", stats.get("Pieton") + 1);
            }
        }
        return stats;
    }

    public static void ecrireStats(Map<String, Integer> stats){
        System.out.println("Voitures : " + stats.get("Voiture") + " soit " + (stats.get("Voiture") / 100.0)*100 + "%");
        System.out.println("Bus : " + stats.get("Bus") + " soit " + (stats.get("Bus") / 100.0)*100 + "%");
        System.out.println("Bicyclettes : " + stats.get("Bicyclette") + " soit " + (stats.get("Bicyclette") / 100.0)*100 + "%");
        System.out.println("Piétons : " + stats.get("Pieton") + " soit " + (stats.get("Pieton") / 100.0)*100 + "%");
    }
}
