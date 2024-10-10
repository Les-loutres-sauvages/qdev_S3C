package ex2_4;

public abstract class DecorationLogo extends Rene {
    public int x, y;
    public String img;
    private Rene composant;

    public DecorationLogo(int x, int y, String logo, Rene composant) {
        this.x = x;
        this.y = y;
        this.img = logo;
        this.composant = composant;
    }

    public logo.MyImage getLogo() {
        logo.MyImage im = composant.getLogo();
        im.paintOver(img, x, y);
        return im;
    }

    public double combienCaCoute() {
        return composant.combienCaCoute();
    }

}
