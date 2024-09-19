import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EtudiantTest {
    Etudiant etu;
    Formation form;

    @BeforeEach
    public void setUp() {
        form = new Formation();
        form.ajouter("Math", 2.0);
        form.ajouter("Francais", 1.0);
        etu = new Etudiant("100", "Dupont", "Michel", new Formation());
        etu.addNote("math", 20);
        etu.addNote("francais", 12);
        etu.addNote("francais", 8);
    }

    /**
     * Test de la méthode calculant la moyenne général de l'étudiant
     */
    @Test
    public void test_moyenne_gen() {
        assertEquals(etu.getMoyenneGeneral, 10);
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

