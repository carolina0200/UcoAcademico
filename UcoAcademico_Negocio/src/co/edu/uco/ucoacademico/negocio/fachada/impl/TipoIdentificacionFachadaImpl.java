package co.edu.uco.ucoacademico.negocio.fachada.impl;

import co.edu.uco.ucoacademico.dto.TipoIdentificacionDTO;
import co.edu.uco.ucoacademico.negocio.dominio.TipoIdentificacion;
import co.edu.uco.ucoacademico.negocio.fachada.TipoIdentificacionFachada;
import co.edu.uco.ucoacademico.negocio.negocio.TipoIdentificacionNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TipoIdentificacionFachadaImpl implements TipoIdentificacionFachada {

    @Autowired
    private TipoIdentificacionNegocio tipoIdentificacionNegocio;

    @Override
    public void registrar(TipoIdentificacionDTO tipoIdentificacionDTO) {
        // ensamblar dominio
        TipoIdentificacion tipoIdentificacion = null;
        tipoIdentificacionNegocio.registrar(tipoIdentificacion);
    }

    @Override
    public void modificar(TipoIdentificacionDTO tipoIdentificacionDTO) {
        // ensamblar dominio
        TipoIdentificacion tipoIdentificacion = null;
        tipoIdentificacionNegocio.modificar(tipoIdentificacion);
    }

    @Override
    public void eliminar(TipoIdentificacionDTO tipoIdentificacionDTO) {
        // ensamblar dominio
        TipoIdentificacion tipoIdentificacion = null;
        tipoIdentificacionNegocio.eliminar(tipoIdentificacion);
    }

    @Override
    public List<TipoIdentificacionDTO> consultar() {
        return null;
    }
}
