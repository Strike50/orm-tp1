package fr.epsi.dao;

import fr.epsi.model.Matiere;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MatiereDaoTest {

    @Test
    public void testAinsertMatiere() {
        Matiere m = new Matiere();
        m.setName("ORM");

        System.out.println(new MatiereDao().save(m));
    }

    @Test
    public void testBgetMatiere() {
        System.out.println("oui");
        Matiere m = new MatiereDao().get(1L);
        assertEquals("ORM", m.getName());
    }
}
