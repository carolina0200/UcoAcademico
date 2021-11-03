package co.edu.uco.ucoacademico.entidad;

import javax.persistence.*;

@Entity
@Table(name="TipoIdentificacion")
public class TipoIdentificacionEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;

    private String nombre;

    public TipoIdentificacionEntidad() { }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
