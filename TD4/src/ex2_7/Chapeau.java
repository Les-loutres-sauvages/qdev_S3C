package ex2_7;

public class Chapeau extends DecorationLogo {

    private final double prix;

    public Chapeau(Logo composant) {
        super(280, 42, "img/Chapeau.png", composant);
        prix = composant.combienCaCoute() + 5;
    }

    public double combienCaCoute() {
        return prix;
    }
}
