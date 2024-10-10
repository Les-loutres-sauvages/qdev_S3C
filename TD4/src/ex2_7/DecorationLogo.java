package ex2_7;

public abstract class DecorationLogo extends Logo {
    public int x, y;
    public String img;
    private Logo composant;

    public DecorationLogo(int x, int y, String logo, Logo composant) {
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
