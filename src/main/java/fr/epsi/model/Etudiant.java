package fr.epsi.model;

import javax.persistence.Entity;
import javax.persistence.Table;

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
}
