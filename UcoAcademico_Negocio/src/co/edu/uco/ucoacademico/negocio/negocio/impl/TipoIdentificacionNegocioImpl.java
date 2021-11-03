package co.edu.uco.ucoacademico.negocio.negocio.impl;

import co.edu.uco.ucoacademico.datos.dao.TipoIdentificacionDAO;
import co.edu.uco.ucoacademico.entidad.TipoIdentificacionEntidad;
import co.edu.uco.ucoacademico.negocio.dominio.TipoIdentificacion;
import co.edu.uco.ucoacademico.negocio.ensamblador.TipoIdentificacionEnsamblador;
import co.edu.uco.ucoacademico.negocio.negocio.TipoIdentificacionNegocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoIdentificacionNegocioImpl implements TipoIdentificacionNegocio {

    @Autowired
    private TipoIdentificacionDAO tipoIdentificacionDAO;

    @Autowired
    private TipoIdentificacionEnsamblador ensamblador;

    @Override
    public void registrar(TipoIdentificacion tipoIdentificacion) {
        tipoIdentificacionDAO.save(ensamblador.dominioAEntidad(tipoIdentificacion));
    }

    @Override
    public void modificar(TipoIdentificacion tipoIdentificacion) {
        tipoIdentificacionDAO.save(ensamblador.dominioAEntidad(tipoIdentificacion));
    }

    @Override
    public void eliminar(TipoIdentificacion tipoIdentificacion) {
        tipoIdentificacionDAO.deleteById(tipoIdentificacion.getCodigo());
    }

    @Override
    public List<TipoIdentificacion> consultar() {
        return ensamblador.entidadesADominios(tipoIdentificacionDAO.findAll());
    }
}
