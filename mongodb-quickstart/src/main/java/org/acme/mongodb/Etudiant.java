package org.acme.mongodb;

import java.util.Objects;


public class Etudiant {
    private String nom;
    private String  prenom;
    private String sexe;
    private String age;
    private String matricule;

    public Etudiant(String nom,String  prenom, String sexe,String age,String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.age = age;
        this.matricule=matricule;
    }


    public Etudiant() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Etudiant eudiant = (Etudiant) object;
        return java.util.Objects.equals(nom, eudiant.nom) && java.util.Objects.equals(prenom, eudiant.prenom) && java.util.Objects.equals(sexe, eudiant.sexe) && java.util.Objects.equals(age, eudiant.age) && java.util.Objects.equals(matricule, eudiant.matricule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nom, prenom, sexe, age, matricule);
    }
}
