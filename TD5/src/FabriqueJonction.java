public class FabriqueJonction implements FabriqueVehicule {

    FabriqueVehicule fab1;
    FabriqueVehicule fab2;
    boolean first = false;

    public FabriqueJonction(FabriqueVehicule fab1, FabriqueVehicule fab2) {
        this.fab1 = fab1;
        this.fab2 = fab2;
    }

    public Vehicule creerVehicule() {
        if (first) {
            first = false;
            return  fab1.creerVehicule();
        } else {
            first = true;
            return fab2.creerVehicule();
        }
    }
}
