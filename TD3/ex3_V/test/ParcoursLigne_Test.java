import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ParcoursLigne_Test {
    TableauEntier tab;
    ParcoursLigne parc;


    @BeforeEach
    public void setUp() {
        int[][] tab1 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };

        tab = new TableauEntier(tab1);
    }

    @Test
    public void test_ajout() {
        ParcoursLigne parcours = tab.iterateurLigne();
        int[][] tab2 = new int[tab.getHauteur()][tab.getLargeur()];

        while (parcours.hasNext()) {
            int elt = parcours.next();
            System.out.println("elt: " + elt);
            tab2[parcours.getLigneCour()][parcours.getColonneCour()] = elt;
        }
        assertEquals(true, tab.equals(tab2));
    }

}