package co.edu.uco.ucoacademico.datos.dao;

import co.edu.uco.ucoacademico.entidad.TipoIdentificacionEntidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoIdentificacionDAO extends CrudRepository<TipoIdentificacionEntidad, Integer> {
}
