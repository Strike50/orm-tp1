package fr.epsi.dao;

import fr.epsi.model.Etudiant;
import fr.epsi.model.User;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EtudiantDaoTest {

    @Test
    public void testAinsertEtudiant() {
        Etudiant etudiant = new Etudiant();
        etudiant.setFirstname("Louka");
        etudiant.setLastname("Houlgatte");
        etudiant.setMail("loua.hb@epsi.fr");
        etudiant.setClasse("B3 C1");

        System.out.println(new ProfesseurDao().save(etudiant));
        System.out.println("test");
    }

    @Test
    public void testBgetEtudiant() {
        User u = new UserDao().get(1L);
        assertEquals("Louka",u.getFirstname());
    }
}
