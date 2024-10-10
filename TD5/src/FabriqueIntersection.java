public class FabriqueIntersection {

    double probaVoiture, probaBus, probaBicyclette, probaPieton;

    public FabriqueIntersection(double pourVoiture,
                                double pourBus,
                                double pourBicyclette,
                                double pourPieton) {
        if (pourPieton < 0 || pourBicyclette < 0 || pourBus < 0 || pourVoiture < 0)
            throw new IllegalArgumentException("Les pourcentages ne peuvent pas être négatifs");
        else {
            if (pourVoiture + pourBus + pourBicyclette + pourPieton == 100) {
                this.probaVoiture = pourVoiture;
                this.probaBus = pourBus;
                this.probaBicyclette = pourBicyclette;
                this.probaPieton = pourPieton;
            } else
                throw new IllegalArgumentException("La somme des pourcentages doit être égale à 100");
        }
    }

    public FabriqueIntersection() {
        this.probaVoiture = 80;
        this.probaBus = 5;
        this.probaBicyclette = 5;
        this.probaPieton = 10;
    }

    public Vehicule creerVehicule() {
        int alea = (int) (Math.random() * 100);

        if (alea < probaVoiture) {
            return new FabriqueVoiture().creerVehicule();
        } else if (alea < probaVoiture + probaBus) {
            return new FabriqueBus().creerVehicule();
        } else if (alea < probaVoiture + probaBus + probaBicyclette) {
            return new FabriqueBicyclette().creerVehicule();
        } else {
            return new FabriquePieton().creerVehicule();
        }

    }
}
