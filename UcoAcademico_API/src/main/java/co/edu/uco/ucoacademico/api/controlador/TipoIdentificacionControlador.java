package co.edu.uco.ucoacademico.api.controlador;

import co.edu.uco.ucoacademico.negocio.fachada.TipoIdentificacionFachada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/tipo-identificacion")
public class TipoIdentificacionControlador {

    @Autowired
    private TipoIdentificacionFachada tipoIdentificacionFachada;


}
