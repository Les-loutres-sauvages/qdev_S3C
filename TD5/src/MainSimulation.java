
public class MainSimulation {

    public static void main(String[] args){
        FabriqueIntersection fabBase = new FabriqueIntersection();

        System.out.println("Stats pour une fabrique de base : 80/5/5/10");
        Simulateur.ecrireStats(new Simulateur(fabBase).genererStats());

        FabriqueIntersection fabPerso = new FabriqueIntersection(50, 30, 10, 10);

        System.out.println("Stats pour une fabrique personnalisée : 50/30/10/10");
        Simulateur.ecrireStats(new Simulateur(fabPerso).genererStats());
    }
}
