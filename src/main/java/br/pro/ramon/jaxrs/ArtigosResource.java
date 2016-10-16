package br.pro.ramon.jaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/artigos")
public class ArtigosResource {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Artigo getArtigo(@PathParam("id") int id) {
        return new Artigo(id);
    }

}
