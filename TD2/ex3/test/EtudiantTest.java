import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EtudiantTest {
    Etudiant etu;
    Formation form;

    @BeforeEach
    public void setUp() {
        form = new Formation(1);
        form.ajouter("Math", 2.0);
        form.ajouter("Francais", 1.0);

        etu = new Etudiant("100", "Dupont", "Michel", form);
        etu.addNote("math", 20);
        etu.addNote("francais", 12);
        etu.addNote("francais", 8);
        // fr a donc une moyenne de 10 et compte coef 1
        // math a donc une moyenne de 20 et compte coef 2
    }

    /**
     * Test de la méthode calculant la moyenne général de l'étudiant
     */
    @Test
    public void test_moyenne_gen() {
        assertEquals(etu.getMoyenneGenerale(), 10);
    }

    /**
     * Test de la méthode calculant la moyenne d'une matière
     */
    @Test
    public void test_moyenne_fr() {
        assertEquals(etu.getMoyenne("francais"), 10);
    }

    /**
     * Test de la méthode calculant la moyenne d'une matière
     */
    @Test
    public void test_moyenne_math() {
        assertEquals(etu.getMoyenne("math"), 20);
    }

    /**
     * Test de la méthode calculant la moyenne d'une matière inexistante
     */
    @Test
    public void test_moyenne_inexistante() {
        try {
            assertEquals(etu.getMoyenne("SI"), 20);
        } catch (IllegalArgumentException e1) {
            assertTrue(true);
        } catch (Exception e2) {
            fail();
        }

    }

}

