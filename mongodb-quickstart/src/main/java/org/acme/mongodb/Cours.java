package org.acme.mongodb;
import java.util.Objects;

public class Cours {

    private String nom;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer id;

    public Cours(Integer id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cours cours = (Cours) o;
        return Objects.equals(nom, cours.nom) && Objects.equals(id, cours.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, id);
    }
}
