package co.edu.uco.ucoacademico.api.controlador;

import co.edu.uco.ucoacademico.dto.TipoIdentificacionDTO;
import co.edu.uco.ucoacademico.negocio.fachada.TipoIdentificacionFachada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tipo-identificacion")
public class TipoIdentificacionControlador {

    @Autowired
    private TipoIdentificacionFachada fachada;

    @GetMapping
    public ResponseEntity<List<TipoIdentificacionDTO>> getAll() {
        return new ResponseEntity<>(fachada.consultar(), HttpStatus.OK);
    }

    @PostMapping
    public void save(@RequestBody TipoIdentificacionDTO tipoIdentificacionDTO) {
        fachada.registrar(tipoIdentificacionDTO);
    }


}
