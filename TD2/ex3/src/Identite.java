

public class Identite {

    private final String nip, nom, prenom;

    public Identite(String nip, String n, String p) {
        this.nip = nip;
        this.nom = n;
        this.prenom = p;
    }

    public String getNip() {
        return nip;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return "Identite [nip=" + nip + ", nom=" + nom + ", prenom=" + prenom + "]";
    }
}
