package fr.epsi.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "etudiant")
public class Etudiant extends User {

    private String classe;

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @OneToMany (mappedBy = "etudiant")
    private Set<Note> listNote;
}
