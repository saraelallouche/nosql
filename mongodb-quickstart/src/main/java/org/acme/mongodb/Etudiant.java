package org.acme.mongodb;

import java.util.Objects;


public class Etudiant {

    private Integer id;

    private String nom;
    private String  prenom;
    private String sexe;
    private String age;
    private String matricule;

    public Etudiant(Integer id,String nom,String  prenom, String sexe,String age,String matricule) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.age = age;
        this.matricule=matricule;
    }


    public Etudiant() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return Objects.equals(id, etudiant.id) && Objects.equals(nom, etudiant.nom) && Objects.equals(prenom, etudiant.prenom) && Objects.equals(sexe, etudiant.sexe) && Objects.equals(age, etudiant.age) && Objects.equals(matricule, etudiant.matricule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, prenom, sexe, age, matricule);
    }
}
