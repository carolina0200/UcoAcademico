package co.edu.uco.ucoacademico.negocio.fachada;

import co.edu.uco.ucoacademico.dto.PersonaDTO;

import java.util.List;

public interface PersonaFachada {
    void registrar(PersonaDTO personaDTO);
    void modificar(PersonaDTO personaDTO);
    void eliminar(PersonaDTO personaDTO);
    List<PersonaDTO> consultar();
}
