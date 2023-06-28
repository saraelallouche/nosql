package org.acme.mongodb;
import java.util.ArrayList;
import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

@ApplicationScoped
public class EtudiantService {

    @Inject
    MongoClient mongoClient;

    public List<Etudiant> list() {
        List<Etudiant> list = new ArrayList<>();
        MongoCursor<Document> cursor = getCollection().find().iterator();

        try {
            while (cursor.hasNext()) {
                Document document = cursor.next();
                Etudiant etudiant = new Etudiant();

                etudiant.setPrenom(document.getString("prenom"));
                etudiant.setNom(document.getString("nom"));
                etudiant.setAge(document.getInteger("age"));
                etudiant.setSexe(document.getString("sexe"));
                etudiant.setMatricule(document.getInteger("matricule"));
                list.add(etudiant);
            }
        } finally {
            cursor.close();
        }
        return list;
    }

    public void add(Etudiant etudiant) {
        Document document = new Document()

                .append("nom", etudiant.getNom())
                .append("prenom", etudiant.getPrenom())
        .append("age", etudiant.getAge())
        .append("sexe", etudiant.getSexe())
        .append("matricule", etudiant.getMatricule());
        getCollection().insertOne(document);
    }

    public Etudiant getEtudiant(Integer id){
        MongoCursor<Document> cursor = getCollection().find().iterator();

        Etudiant etudiant = new Etudiant();
        return etudiant;

    }

    private MongoCollection getCollection() {
        return mongoClient.getDatabase("admin").getCollection("Etudiant");
    }
}
