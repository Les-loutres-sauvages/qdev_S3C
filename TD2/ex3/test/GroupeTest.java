import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.lang.Math.round;
import static org.junit.jupiter.api.Assertions.*;

public class GroupeTest {
    Groupe groupe;
    Formation form;
    Etudiant etu1, etu2;


    @BeforeEach
    public void setUp() {
        form = new Formation(1);
        form.ajouter("math", 1.0);
        form.ajouter("info", 2.0);

        groupe = new Groupe(form);

        etu1 = new Etudiant("100", "Dupont", "Michel", form);
        etu2 = new Etudiant("101", "Dupont", "Michel", form);
    }

    @Test
    public void test_ajout() {
        groupe.ajouter(etu1);
        groupe.ajouter(etu2);

        assertEquals(groupe.toString(), "Groupe{groupe=[Etudiant (100), Etudiant (101), ");
    }

    @Test
    public void test_suppression() {
        groupe.ajouter(etu1);
        groupe.ajouter(etu2);

        groupe.supprimer(etu1);

        assertEquals(groupe.toString(), "Groupe{groupe=[Etudiant (101), ");
    }

    @Test
    public void test_ajout_mauvaise_formation() {
        Formation form2 = new Formation(2);

        Etudiant etu3 = new Etudiant("102", "Dupont", "Michel", form2);

        assertThrows(IllegalArgumentException.class, () -> {
            groupe.ajouter(etu3);
        });
    }


    @Test
    public void test_moyenne_groupe() throws Exception {
        groupe.ajouter(etu1);
        groupe.ajouter(etu2);

        etu1.addNote("math", 10);
        etu2.addNote("math", 15);

        assertEquals(groupe.getMoyenneGroupe("math"), 12.5);
    }

    @Test
    public void test_moyenne_groupe_matiere_inexistante() {
        assertThrows(IllegalArgumentException.class, () -> {
            groupe.getMoyenneGroupe("NSI");
        });
    }

    @Test
    public void test_moyenne_generale_groupe() throws Exception {
        groupe.ajouter(etu1);
        groupe.ajouter(etu2);


        etu1.addNote("math", 10);  // coef 1
        etu2.addNote("math", 20);  // coef 1

        etu1.addNote("info", 20);  // coef 2
        etu2.addNote("info", 10);  // coef 2


        //moy math = 15
        //moy info = 15

        //moy gen = (15 + 15*2) / 3 = 15
        assertEquals(groupe.getMoyenneGeneraleGroupe(), 15);
    }
}