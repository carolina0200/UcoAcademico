package co.edu.uco.ucoacademico.datos.dao;

import co.edu.uco.ucoacademico.entidad.PersonaEntidad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PersonaDAO extends CrudRepository<PersonaEntidad, Integer> {
}
