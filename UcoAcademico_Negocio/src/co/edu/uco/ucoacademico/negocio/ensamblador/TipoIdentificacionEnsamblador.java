package co.edu.uco.ucoacademico.negocio.ensamblador;

import co.edu.uco.ucoacademico.dto.TipoIdentificacionDTO;
import co.edu.uco.ucoacademico.entidad.TipoIdentificacionEntidad;
import co.edu.uco.ucoacademico.negocio.dominio.TipoIdentificacion;
import org.mapstruct.Mapper;

@Mapper
public interface TipoIdentificacionEnsamblador {

    TipoIdentificacionEntidad dominioAEntidad(TipoIdentificacion tipoIdentificacion);
    TipoIdentificacion entidadADominio(TipoIdentificacionEntidad tipoIdentificacionEntidad);

    TipoIdentificacionDTO dominioADTO(TipoIdentificacion tipoIdentificacion);
    TipoIdentificacion DTOADominio(TipoIdentificacionDTO tipoIdentificacionDTO);
}
