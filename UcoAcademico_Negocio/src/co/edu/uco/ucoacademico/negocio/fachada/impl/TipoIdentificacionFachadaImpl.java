package co.edu.uco.ucoacademico.negocio.fachada.impl;

import co.edu.uco.ucoacademico.dto.TipoIdentificacionDTO;
import co.edu.uco.ucoacademico.negocio.dominio.TipoIdentificacion;
import co.edu.uco.ucoacademico.negocio.ensamblador.TipoIdentificacionEnsamblador;
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

    @Autowired
    private TipoIdentificacionEnsamblador ensamblador;

    @Override
    public void registrar(TipoIdentificacionDTO tipoIdentificacionDTO) {
        tipoIdentificacionNegocio.registrar(ensamblador.DTOADominio(tipoIdentificacionDTO));
    }

    @Override
    public void modificar(TipoIdentificacionDTO tipoIdentificacionDTO) {
        tipoIdentificacionNegocio.modificar(ensamblador.DTOADominio(tipoIdentificacionDTO));
    }

    @Override
    public void eliminar(TipoIdentificacionDTO tipoIdentificacionDTO) {
        tipoIdentificacionNegocio.eliminar(ensamblador.DTOADominio(tipoIdentificacionDTO));
    }

    @Override
    public List<TipoIdentificacionDTO> consultar() {
        return ensamblador.dominiosADTOs(tipoIdentificacionNegocio.consultar());
    }
}
