package fr.epsi.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table (name = "professeur")
public class Professeur extends User {

    @OneToMany (mappedBy = "professeur")
    Set<Note> listNote;
}
