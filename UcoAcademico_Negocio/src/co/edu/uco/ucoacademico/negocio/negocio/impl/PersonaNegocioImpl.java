package co.edu.uco.ucoacademico.negocio.negocio.impl;

import co.edu.uco.ucoacademico.datos.dao.PersonaDAO;
import co.edu.uco.ucoacademico.entidad.PersonaEntidad;
import co.edu.uco.ucoacademico.negocio.dominio.Persona;
import co.edu.uco.ucoacademico.negocio.negocio.PersonaNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaNegocioImpl implements PersonaNegocio {

    @Autowired
    private PersonaDAO personaDAO;

    @Override
    public void registrar(Persona persona) {
        // ensamblar
        PersonaEntidad personaEntidad = null;
        personaDAO.save(personaEntidad);
    }

    @Override
    public void modificar(Persona persona) {
        // ensamblar
        PersonaEntidad personaEntidad = null;
        personaDAO.save(personaEntidad);
    }

    @Override
    public void eliminar(Persona persona) {
        personaDAO.deleteById(persona.getCodigo());
    }

    @Override
    public List<Persona> consultar() {
        var resultados = personaDAO.findAll();
        // ensamblar
        return null;
    }
}
