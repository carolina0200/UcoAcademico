package co.edu.uco.ucoacademico.negocio.fachada.impl;

import co.edu.uco.ucoacademico.dto.PersonaDTO;
import co.edu.uco.ucoacademico.negocio.dominio.Persona;
import co.edu.uco.ucoacademico.negocio.fachada.PersonaFachada;
import co.edu.uco.ucoacademico.negocio.negocio.PersonaNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PersonaFachadaImpl implements PersonaFachada {

    @Autowired
    private PersonaNegocio personaNegocio;

    @Override
    public void registrar(PersonaDTO personaDTO) {
        // ensamblar dominio
        Persona persona = null;
        personaNegocio.registrar(persona);
    }

    @Override
    public void modificar(PersonaDTO personaDTO) {
        // ensamblar dominio
        Persona persona = null;
        personaNegocio.modificar(persona);
    }

    @Override
    public void eliminar(PersonaDTO personaDTO) {
        // ensamblar dominio
        Persona persona = null;
        personaNegocio.eliminar(persona);
    }

    @Override
    public List<PersonaDTO> consultar() {
        return null;
    }
}
