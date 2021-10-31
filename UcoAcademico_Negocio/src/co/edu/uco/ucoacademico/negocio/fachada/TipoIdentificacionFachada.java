package co.edu.uco.ucoacademico.negocio.fachada;

import co.edu.uco.ucoacademico.dto.TipoIdentificacionDTO;

import java.util.List;

public interface TipoIdentificacionFachada {
    void registrar(TipoIdentificacionDTO tipoIdentificacionDTO);
    void modificar(TipoIdentificacionDTO tipoIdentificacionDTO);
    void eliminar(TipoIdentificacionDTO tipoIdentificacionDTO);
    List<TipoIdentificacionDTO> consultar();
}
