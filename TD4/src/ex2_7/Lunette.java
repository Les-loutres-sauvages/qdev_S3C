package ex2_7;

public class Lunette extends DecorationLogo {
    private final double prix;

    public Lunette(Logo composant) {
        super(255, 76, "img/Sunglasses.png", composant);
        prix = composant.combienCaCoute() + 7;
    }

    public double combienCaCoute() {
        return prix;
    }

}
