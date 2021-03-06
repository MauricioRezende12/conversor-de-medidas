package com.mauriciorezende12.atividadesoa;

import static com.mauriciorezende12.atividadesoa.ConversorTipoEnum.POLEGADAS_PARA_METROS;

/**
 * @author Mauricio Rezende
 * Description: Esse servico converte de polegadas para metros.
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/polegadasparametros")
public class PolegadasMetrosService
{

    @GET
    @Produces("application/json")
    public Response converterPolegadasParaMetros()
    {

        String result = ConversorUtil.converter(POLEGADAS_PARA_METROS, "Polegadas", "Metros", 1f);

        return Response.status(200).entity(result).build();
    }

    @Path("{polegadas}")
    @GET
    @Produces("application/json")
    public Response converterPolegadasParaMetros(@PathParam("polegadas") float polegadas)
    {

        String result = ConversorUtil.converter(POLEGADAS_PARA_METROS, "Polegadas", "Metros", polegadas);

        return Response.status(200).entity(result).build();
    }
}