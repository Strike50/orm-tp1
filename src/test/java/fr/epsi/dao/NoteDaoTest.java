package fr.epsi.dao;

import fr.epsi.model.Etudiant;
import fr.epsi.model.Matiere;
import fr.epsi.model.Note;
import fr.epsi.model.Professeur;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NoteDaoTest {

    @Test
    public void testAinsertNote() {
//        Matiere m = new Matiere();
//        m.setName("ORM");
//        Etudiant e = new Etudiant();
//        e.setFirstname("Louka");
//        e.setLastname("Houlgatte");
//        e.setMail("louka.hbnnnnnn@epsi.fr");
//        e.setClasse("B3 C1");
//        Professeur p = new Professeur();
//        p.setFirstname("Benjamin");
//        p.setLastname("Tourman");
//        p.setMail("b.tourmanjjjjj@epsi.fr");
//        Note n = new Note();
//        n.setBareme(20);
//        n.setNombre(15.98f);
//        n.setEtudiant(e);
//        n.setProfesseur(p);
//        n.setMatiere(m);
//
//        System.out.println(new NoteDao().save(n));
    }

    @Test
    public void testBgetNote() {
//        Note n = new NoteDao().get(1L);
//        assertEquals(20, n.getBareme());
//        assertEquals(2, n.getEtudiant().getId());
    }
}
