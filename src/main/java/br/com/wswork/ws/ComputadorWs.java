package br.com.wswork.ws;

import br.com.wswork.model.Computador;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import java.util.ArrayList;
import java.util.List;

@Path("/computador")
@Produces("application/json; charset=UTF-8")
@RequestScoped
public class ComputadorWs {

    @GET
    @Path("/")
    public Response getComputadorList() {

        List<Computador> listaDeComputador = new ArrayList<Computador>();

        Computador computadorLixo = new Computador(100.00, 2011, 7l, "white");
        Computador computadorMedio = new Computador(400.00, 2015, 1l, "black");
        Computador computadorBom = new Computador(1300.50, 2018, 5l, "gray");
        Computador computadorGamer = new Computador(4000.99, 2021, 4l, "red");

        listaDeComputador.add(computadorLixo);
        listaDeComputador.add(computadorMedio);
        listaDeComputador.add(computadorBom);
        listaDeComputador.add(computadorGamer);

        ResponseBuilder builder = Response.status(Response.Status.OK).entity(listaDeComputador);

        return builder.build();
    }

    @DELETE
    @Path("/")
    @Consumes("application/json")
    public Response delete() {

        List<Computador> listaDeComputador = new ArrayList<Computador>();

        Computador computadorLixo = new Computador(100.00, 2011, 7l, "white");
        Computador computadorMedio = new Computador(400.00, 2015, 1l, "black");
        Computador computadorBom = new Computador(1300.50, 2018, 5l, "gray");
        Computador computadorGamer = new Computador(4000.99, 2021, 4l, "red");

        listaDeComputador.add(computadorLixo);
        listaDeComputador.add(computadorMedio);
        listaDeComputador.add(computadorBom);
        listaDeComputador.add(computadorGamer);

        ResponseBuilder builder = Response.status(Response.Status.OK).entity(listaDeComputador);

        return builder.build();
    }

    @PUT
    @Path("/")
    public Response savePC(Computador computador){

        List<Computador> listaDeComputador = new ArrayList<Computador>();

        Computador computadorLixo = new Computador(100.00, 2011, 7l, "white");
        Computador computadorMedio = new Computador(400.00, 2015, 1l, "black");
        Computador computadorBom = new Computador(1300.50, 2018, 5l, "gray");
        Computador computadorGamer = new Computador(4000.99, 2021, 4l, "red");

        listaDeComputador.add(computadorLixo);
        listaDeComputador.add(computadorMedio);
        listaDeComputador.add(computadorBom);
        listaDeComputador.add(computadorGamer);

        ResponseBuilder builder = Response.status(Response.Status.OK).entity(listaDeComputador);

        return builder.build();
    }

    }


