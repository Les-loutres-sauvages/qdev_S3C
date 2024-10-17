import java.sql.SQLOutput;
import java.util.concurrent.ThreadLocalRandom;

class Avion extends Thread {
    private String nom;
    private Aeroport a;
    private int tempmax = 15000;
    private int tempmin = 7000;

    public Avion(String s) {
        this.nom = s;
    }

    public void run() {
        this.a = Aeroport.getInstance();
        System.out.println("Je suis avion: " + this.nom + " sur aeroport " + this.a + " et je demande l'autorisation de decoller");
        decoller();
    }

    public void decoller(){
        try {
            if (this.a.autorisationAdecoller()) {
                System.out.println("Je suis avion: " + this.nom + " sur aeroport " + this.a + " et j'ai l'autorisation de decoller");
                System.out.println(this.nom + " décolle ....");
                int rand = ThreadLocalRandom.current().nextInt(tempmin, tempmax);
                Thread.sleep(rand);
                System.out.println(this.nom + " a libéré la piste");
                this.a.liberer_piste();
            } else {
                System.out.println(".");
                decoller();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}