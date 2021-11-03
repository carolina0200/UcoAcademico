package co.edu.uco.ucoacademico.entidad;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "persona")
public class PersonaEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    private String nombre;

    private String email;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "tipo_id")
    private int tipoId;

    @ManyToOne
    @JoinColumn(name="tipo_id", referencedColumnName="codigo", insertable=false, updatable=false)
    private TipoIdentificacionEntidad tipoIdentificacion;

    public PersonaEntidad() { }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public TipoIdentificacionEntidad getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoIdentificacionEntidad tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public int getTipoId() {
        return tipoId;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }
}
