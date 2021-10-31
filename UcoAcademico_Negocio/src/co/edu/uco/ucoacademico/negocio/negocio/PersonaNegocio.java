package co.edu.uco.ucoacademico.negocio.negocio;

import co.edu.uco.ucoacademico.negocio.dominio.Persona;

import java.util.List;

public interface PersonaNegocio {

    void registrar(Persona persona);
    void modificar(Persona persona);
    void eliminar(Persona persona);
    List<Persona> consultar();
}
