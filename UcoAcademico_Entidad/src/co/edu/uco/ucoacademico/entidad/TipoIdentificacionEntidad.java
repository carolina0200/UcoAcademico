package co.edu.uco.ucoacademico.entidad;

import javax.persistence.*;

@Entity
@Table(name="TipoIdentificacion")
public class TipoIdentificacionEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;

    private String nombre;
}
