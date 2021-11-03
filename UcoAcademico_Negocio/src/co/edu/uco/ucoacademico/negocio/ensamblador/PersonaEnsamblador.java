package co.edu.uco.ucoacademico.negocio.ensamblador;

import co.edu.uco.ucoacademico.dto.PersonaDTO;
import co.edu.uco.ucoacademico.entidad.PersonaEntidad;
import co.edu.uco.ucoacademico.negocio.dominio.Persona;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", uses = {TipoIdentificacionEnsamblador.class}, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PersonaEnsamblador {
    PersonaEntidad dominioAEntidad(Persona persona);
    Persona entidadADominio(PersonaEntidad personaEntidad);

    PersonaDTO dominioADTO(Persona persona);
    Persona DTOADominio(PersonaDTO personaDTO);

    List<Persona> entidadesADominios(Iterable<PersonaEntidad> personaEntidades);
    List<PersonaDTO> dominiosADTOs(List<Persona> personas);

    @AfterMapping
    default void after(@MappingTarget PersonaEntidad personaEntidad, Persona persona) {
        personaEntidad.setTipoId(persona.getTipoIdentificacion().getCodigo());
    }
}
