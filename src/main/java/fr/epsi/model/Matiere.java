package fr.epsi.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

public class Matiere implements Serializable {

    @Id
    @GeneratedValue
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
}
