package co.edu.uco.ucoacademico.negocio.negocio;

import co.edu.uco.ucoacademico.negocio.dominio.TipoIdentificacion;

import java.util.List;

public interface TipoIdentificacionNegocio {

    void registrar(TipoIdentificacion tipoIdentificacion);
    void modificar(TipoIdentificacion tipoIdentificacion);
    void eliminar(TipoIdentificacion tipoIdentificacion);
    List<TipoIdentificacion> consultar();

}
