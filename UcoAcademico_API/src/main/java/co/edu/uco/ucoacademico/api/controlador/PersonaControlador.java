package co.edu.uco.ucoacademico.api.controlador;

import co.edu.uco.ucoacademico.negocio.fachada.PersonaFachada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/persona")
public class PersonaControlador {

    @Autowired
    private PersonaFachada personaFachada;
}
