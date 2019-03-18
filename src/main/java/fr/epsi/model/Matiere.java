package fr.epsi.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table (name = "matiere")
public class Matiere implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public Matiere() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    @OneToMany (mappedBy = "matiere")
    List<Note> listNote;
}
