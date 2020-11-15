package com.mauriciorezende12.atividadesoa;

import static com.mauriciorezende12.atividadesoa.ConversorTipoEnum.POLEGADAS_PARA_PES;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/polegadasparapes")
public class PolegadasPesService
{

    @GET
    @Produces("application/json")
    public Response converterPolegadasParaPes()
    {

        String result = ConversorUtil.converter(POLEGADAS_PARA_PES, "Polegadas", "Pes", 1f);

        return Response.status(200).entity(result).build();
    }

    @Path("{polegadas}")
    @GET
    @Produces("application/json")
    public Response converterPolegadasParaPes(@PathParam("polegadas") float polegadas)
    {

        String result = ConversorUtil.converter(POLEGADAS_PARA_PES, "Polegadas", "Pes", polegadas);

        return Response.status(200).entity(result).build();
    }
}