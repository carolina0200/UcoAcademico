package co.edu.uco.ucoacademico.api.controlador;

import co.edu.uco.ucoacademico.dto.PersonaDTO;
import co.edu.uco.ucoacademico.negocio.fachada.PersonaFachada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("persona")
public class PersonaControlador {

    @Autowired
    private PersonaFachada personaFachada;

    @GetMapping
    public ResponseEntity<List<PersonaDTO>> getAll() {
        return new ResponseEntity<>(personaFachada.consultarDTO(), HttpStatus.OK);
    }

    @PostMapping
    public void save(@RequestBody PersonaDTO personaDTO) {
        personaFachada.registrarDTO(personaDTO);
    }


}
