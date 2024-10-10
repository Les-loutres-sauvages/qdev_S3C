package ex2_4;

public class Chapeau extends DecorationLogo {

    private double prix;

    public Chapeau(Rene composant) {
        super(280, 42, "img/Chapeau.png", composant);
        prix = composant.combienCaCoute() + 5;
    }

    public double combienCaCoute() {
        return prix;
    }
}
