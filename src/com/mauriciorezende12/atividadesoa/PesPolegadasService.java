package com.mauriciorezende12.atividadesoa;

import static com.mauriciorezende12.atividadesoa.ConversorTipoEnum.PES_PARA_POLEGADAS;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/pesparapolegadas")
public class PesPolegadasService
{

    @GET
    @Produces("application/json")
    public Response converterPesParaPolegadas()
    {

		String result = ConversorUtil.converter(PES_PARA_POLEGADAS, "Pes", "Polegadas", 1f);

		return Response.status(200).entity(result).build();
    }

    @Path("{pes}")
    @GET
    @Produces("application/json")
    public Response converterPesParaPolegadas(@PathParam("pes") float pes)
    {

        String result = ConversorUtil.converter(PES_PARA_POLEGADAS, "Pes", "Polegadas", pes);
        return Response.status(200).entity(result).build();
    }
}