package co.edu.uco.ucoacademico.negocio.negocio.impl;

import co.edu.uco.ucoacademico.datos.dao.PersonaDAO;
import co.edu.uco.ucoacademico.entidad.PersonaEntidad;
import co.edu.uco.ucoacademico.negocio.dominio.Persona;
import co.edu.uco.ucoacademico.negocio.ensamblador.PersonaEnsamblador;
import co.edu.uco.ucoacademico.negocio.negocio.PersonaNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaNegocioImpl implements PersonaNegocio {

    @Autowired
    private PersonaDAO personaDAO;

    @Autowired
    private PersonaEnsamblador ensamblador;

    @Override
    public void registrar(Persona persona) {
        personaDAO.save(ensamblador.dominioAEntidad(persona));
    }

    @Override
    public void modificar(Persona persona) {
        personaDAO.save(ensamblador.dominioAEntidad(persona));
    }

    @Override
    public void eliminar(Persona persona) {
        personaDAO.deleteById(persona.getCodigo());
    }

    @Override
    public List<Persona> consultar() {
        return ensamblador.entidadesADominios(personaDAO.findAll());
    }
}
