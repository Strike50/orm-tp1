package fr.epsi.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

public class Note implements Serializable {

    @Id
    @GeneratedValue
    private long id;
    private float nombre;
    private int bareme;

    public int getBareme() {
        return bareme;
    }

    public void setBareme(int bareme) {
        this.bareme = bareme;
    }

    public float getNombre() {
        return nombre;
    }

    public void setNombre(float nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }
}
