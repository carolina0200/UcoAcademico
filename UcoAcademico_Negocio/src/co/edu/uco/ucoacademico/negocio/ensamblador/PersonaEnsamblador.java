package co.edu.uco.ucoacademico.negocio.ensamblador;

import co.edu.uco.ucoacademico.dto.PersonaDTO;
import co.edu.uco.ucoacademico.entidad.PersonaEntidad;
import co.edu.uco.ucoacademico.negocio.dominio.Persona;
import org.mapstruct.Mapper;

@Mapper
public interface PersonaEnsamblador {
    PersonaEntidad dominioAEntidad(Persona persona);
    Persona entidadADominio(PersonaEntidad personaEntidad);

    PersonaDTO dominioADTO(Persona persona);
    Persona DTOADominio(PersonaDTO personaDTO);
}
