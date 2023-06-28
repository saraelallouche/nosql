package org.acme.mongodb;
import java.util.Objects;

public class Cours {

    private String nom;

    public Cours(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Cours cours = (Cours) object;
        return java.util.Objects.equals(nom, cours.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nom);
    }
}
