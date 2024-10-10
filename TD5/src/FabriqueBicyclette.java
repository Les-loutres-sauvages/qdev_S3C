public class FabriqueBicyclette implements FabriqueVehicule {

    public FabriqueBicyclette() {
    }

    public Vehicule creerVehicule() {
        return new Bicyclette();
    }
}
