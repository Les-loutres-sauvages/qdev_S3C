package cafe;

public class PrincipaleCafe {
    public static void main(String[] args) {
        Boisson b = new Deca();

        System.out.println("Avant crème : \n");
        System.out.println(b.getDescription());
        System.out.println(b.cout());

        b = new BoissonCreme(new BoissonChantilly(new BoissonChantilly(b)));
        System.out.println(b.getDescription());
        System.out.println(b.cout());

    }
}
