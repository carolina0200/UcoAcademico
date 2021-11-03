package co.edu.uco.ucoacademico.negocio.fachada.impl;

import co.edu.uco.ucoacademico.dto.PersonaDTO;
import co.edu.uco.ucoacademico.negocio.dominio.Persona;
import co.edu.uco.ucoacademico.negocio.ensamblador.PersonaEnsamblador;
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

    @Autowired
    private PersonaEnsamblador ensamblador;

    @Override
    public void registrarDTO(PersonaDTO personaDTO) {
        personaNegocio.registrar(ensamblador.DTOADominio(personaDTO));
    }

    @Override
    public void modificarDTO(PersonaDTO personaDTO) {
        personaNegocio.modificar(ensamblador.DTOADominio(personaDTO));
    }

    @Override
    public void eliminarDTO(PersonaDTO personaDTO) {
        personaNegocio.eliminar(ensamblador.DTOADominio(personaDTO));
    }

    @Override
    public List<PersonaDTO> consultarDTO() {
        return ensamblador.dominiosADTOs(personaNegocio.consultar());
    }
}
