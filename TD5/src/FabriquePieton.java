public class FabriquePieton implements FabriqueVehicule {

    public Vehicule creerVehicule() {
        return new Pieton();
    }
}
