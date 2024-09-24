import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GroupeTest_Moyenne {
    Groupe groupe;
    Formation form;
    Etudiant etu1, etu2;


    @BeforeEach
    public void setUp() {
        form = new Formation(1);
        form.ajouter("math", 1.0);
        form.ajouter("info", 1.0);

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
}