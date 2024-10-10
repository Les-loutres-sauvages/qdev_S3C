public class FabriqueBus implements FabriqueVehicule {

    public FabriqueBus() {
    }

    public Vehicule creerVehicule() {
        return new Bus();
    }
}
