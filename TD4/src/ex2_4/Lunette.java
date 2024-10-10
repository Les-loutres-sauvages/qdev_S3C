package ex2_4;

public class Lunette extends DecorationLogo {
    private double prix;

    public Lunette(Rene composant) {
        super(255, 76, "img/Sunglasses.png", composant);
        prix = composant.combienCaCoute() + 7;
    }

    public double combienCaCoute() {
        return prix;
    }

}
