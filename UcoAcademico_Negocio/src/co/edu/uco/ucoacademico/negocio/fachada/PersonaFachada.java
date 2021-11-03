package co.edu.uco.ucoacademico.negocio.fachada;

import co.edu.uco.ucoacademico.dto.PersonaDTO;

import java.util.List;

public interface PersonaFachada {
    void registrarDTO(PersonaDTO personaDTO);
    void modificarDTO(PersonaDTO personaDTO);
    void eliminarDTO(PersonaDTO personaDTO);
    List<PersonaDTO> consultarDTO();
}
