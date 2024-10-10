public abstract class Vehicule {
    protected double vitesse = 0, vitesseMax;
    protected String type;

    public Vehicule(double vitesseMax, String type) {
        this.vitesseMax = vitesseMax;
        this.type = type;
    }

    public double getVitesse() {
        return vitesse;
    }

    public String getType() {
        return type;
    }

    public void accelerer(double vitesse) {
        if (this.vitesse + vitesse <= vitesseMax) {
            this.vitesse += vitesse;
        } else {
            this.vitesse = vitesseMax;
        }
    }

    public void decelerer(double vitesse) {
        if (this.vitesse - vitesse >= 0) {
            this.vitesse -= vitesse;
        } else {
            this.vitesse = 0;
        }
    }
}
