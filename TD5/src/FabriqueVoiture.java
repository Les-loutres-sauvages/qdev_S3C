public class FabriqueVoiture implements FabriqueVehicule {

    public FabriqueVoiture() {
    }

    public Vehicule creerVehicule() {
        return new Voiture();
    }
}
