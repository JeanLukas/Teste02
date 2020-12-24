package br.com.wswork;

import br.com.wswork.model.Computador;
import br.com.wswork.ws.ComputadorWs;

import javax.ws.rs.ApplicationPath;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")

public class Application{
    public Set<Class<?>> getClasses() {
        Set<Class<?>> s = new HashSet<Class<?>>();
        s.add(ComputadorWs.class);
        return s;
    }
}



