public class Aeroport {
    private boolean piste_libre;
    private static Aeroport instance;

    private Aeroport() {
        this.piste_libre = true;
    }

    public static synchronized Aeroport getInstance() {
        if (instance == null) {
            instance = new Aeroport();
        }
        return instance;
    }

    public synchronized boolean autorisationAdecoller() throws InterruptedException {
        if (this.piste_libre) {
            this.piste_libre = false;
            return true;
        } else {
            wait();
            return false;
        }
    }

    public synchronized void liberer_piste() {
        if (!this.piste_libre) {
            this.piste_libre = true;
            notifyAll();
        }
    }
}