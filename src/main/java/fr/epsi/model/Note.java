package fr.epsi.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table (name = "note")
public class Note implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
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

    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "professeur_id")
    Professeur professeur;

    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "etudiant_id")
    Etudiant etudiant;

    @ManyToOne (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn (name = "matiere_id")
    Matiere matiere;

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

}
