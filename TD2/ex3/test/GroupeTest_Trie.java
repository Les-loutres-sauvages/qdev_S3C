import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GroupeTest_Trie {
    Etudiant etu;
    Etudiant etu2;
    Etudiant etu3;
    Etudiant etu4;
    Etudiant etu5;
    Formation form;
    Groupe groupe;

    @BeforeEach
    public void setUp() {
        form = new Formation(1);

        groupe = new Groupe(form);

        etu = new Etudiant("100", "Dupont", "Michel", form);
        etu2 = new Etudiant("101", "Laforge", "Arthur", form);
        etu3 = new Etudiant("102", "Forgeur", "Liam", form);
        etu4 = new Etudiant("103", "Laforge", "Victor", form);
        etu5 = new Etudiant("104", "Forgeur", "Amin", form);

        groupe.ajouter(etu);
        groupe.ajouter(etu2);
        groupe.ajouter(etu3);
        groupe.ajouter(etu4);
        groupe.ajouter(etu5);
    }

    /**
     * Test de la méthode calculant la moyenne général de l'étudiant
     */
    @Test
    public void test_tri_aplha() {
        groupe.triAlpha();
        assertTrue("Groupe{groupe=[Etudiant (100), Etudiant (104), Etudiant (102), Etudiant (101), Etudiant (103)]".equals(groupe.toString()));
    }

    /**
     * Test de la méthode calculant la moyenne d'une matière
     */
    @Test
    public void test_tri_AntiAlpha() {
        groupe.triAntiAlpha();
        assertEquals("Groupe{groupe=[Etudiant (103), Etudiant (101), Etudiant (102), Etudiant (104), Etudiant (100)]", groupe.toString());
    }

}

