package org.acme.mongodb;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("/etudiants")
public class EtudiantRessource {

    @Inject
    EtudiantService etudiantService;

    @GET
    public List<Etudiant> list() {
        return etudiantService.list();
    }

    @POST
    public List<Etudiant> add(Etudiant etudiant) {
        etudiantService.add(etudiant);
        return list();
    }
}
