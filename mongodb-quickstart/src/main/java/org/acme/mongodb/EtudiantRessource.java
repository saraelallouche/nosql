package org.acme.mongodb;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

import java.util.List;

@Path("")
public class EtudiantRessource {

    @Inject
    EtudiantService etudiantService;

    @GET
    @Path("/api/student")
    public List<Etudiant> list() {
        return etudiantService.list();
    }

    @GET
    @Path("/api/student/{id}")
    public Etudiant GetEtudiantById(Integer id) {
        return etudiantService.getEtudiant(id);
    }


    @POST
    @Path("api/student")
    public List<Etudiant> add(Etudiant etudiant) {
        etudiantService.add(etudiant);
        return list();
    }
}
