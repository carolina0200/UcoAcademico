package co.edu.uco.ucoacademico.negocio.ensamblador;

import co.edu.uco.ucoacademico.dto.TipoIdentificacionDTO;
import co.edu.uco.ucoacademico.entidad.TipoIdentificacionEntidad;
import co.edu.uco.ucoacademico.negocio.dominio.TipoIdentificacion;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TipoIdentificacionEnsamblador {

    TipoIdentificacionEntidad dominioAEntidad(TipoIdentificacion tipoIdentificacion);
    TipoIdentificacion entidadADominio(TipoIdentificacionEntidad tipoIdentificacionEntidad);

    TipoIdentificacionDTO dominioADTO(TipoIdentificacion tipoIdentificacion);
    TipoIdentificacion DTOADominio(TipoIdentificacionDTO tipoIdentificacionDTO);

    List<TipoIdentificacion> entidadesADominios(Iterable<TipoIdentificacionEntidad> tipoIdentificacionEntidades);
    List<TipoIdentificacionDTO> dominiosADTOs(List<TipoIdentificacion> tipoIdentificacions);
}
