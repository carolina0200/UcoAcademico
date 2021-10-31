package co.edu.uco.ucoacademico.negocio.negocio.impl;

import co.edu.uco.ucoacademico.datos.dao.TipoIdentificacionDAO;
import co.edu.uco.ucoacademico.entidad.TipoIdentificacionEntidad;
import co.edu.uco.ucoacademico.negocio.dominio.TipoIdentificacion;
import co.edu.uco.ucoacademico.negocio.negocio.TipoIdentificacionNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoIdentificacionNegocioImpl implements TipoIdentificacionNegocio {

    @Autowired
    private TipoIdentificacionDAO tipoIdentificacionDAO;

    @Override
    public void registrar(TipoIdentificacion tipoIdentificacion) {
        // Ensamblar entidad
        TipoIdentificacionEntidad tipoIdentificacionEntidad = null;
        tipoIdentificacionDAO.save(tipoIdentificacionEntidad);
    }

    @Override
    public void modificar(TipoIdentificacion tipoIdentificacion) {
        // Ensamblar entidad
        TipoIdentificacionEntidad tipoIdentificacionEntidad = null;
        tipoIdentificacionDAO.save(tipoIdentificacionEntidad);
    }

    @Override
    public void eliminar(TipoIdentificacion tipoIdentificacion) {
        tipoIdentificacionDAO.deleteById(tipoIdentificacion.getCodigo());
    }

    @Override
    public List<TipoIdentificacion> consultar() {
        var resultado = tipoIdentificacionDAO.findAll();
        // Ensamblar a dominio
        return null;
    }
}
