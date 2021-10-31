package co.edu.uco.ucoacademico.entidad;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "persona")
public class PersonaEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;

    private String nombre;

    private String email;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    private TipoIdentificacionEntidad tipoIdentificacion;
}
