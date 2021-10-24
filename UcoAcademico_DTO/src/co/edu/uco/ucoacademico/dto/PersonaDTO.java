package co.edu.uco.ucoacademico.dto;

import static co.edu.uco.ucoacademico.transversal.utilitario.UtilObjeto.obtenerValorDefecto;
import static co.edu.uco.ucoacademico.transversal.utilitario.UtilFecha.obtenerFechaDefecto;
import static co.edu.uco.ucoacademico.transversal.utilitario.UtilTexto.aplicarTrim;
import java.util.Date;

public class PersonaDTO {
    private int codigo;
    private String nombre;
    private String email;
    private Date fechaNacimiento;
    private int edad;
    private TipoIdentificacionDTO tipoIdentificacion;

    public PersonaDTO() {

    }

    public PersonaDTO(int codigo, String nombre, String email, Date fechaNacimiento, int edad, TipoIdentificacionDTO tipoIdentificacion) {
        setCodigo(codigo);
        setNombre(nombre);
        setEmail(email);
        setFechaNacimiento(fechaNacimiento);
        setEdad(edad);
        setTipoIdentificacion(tipoIdentificacion);
    }

    public static PersonaDTO crear() {
        return new PersonaDTO();
    }

    public int getCodigo() {
        return codigo;
    }

    public PersonaDTO setCodigo(int codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public PersonaDTO setNombre(String nombre) {
        this.nombre = aplicarTrim(nombre);
        return this;
    }

    public String getEmail() {
        return email;
    }

    public PersonaDTO setEmail(String email) {
        this.email = aplicarTrim(email);
        return this;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public PersonaDTO setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = obtenerFechaDefecto(fechaNacimiento);
        return this;
    }

    public int getEdad() {
        return edad;
    }

    public PersonaDTO setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public TipoIdentificacionDTO getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public PersonaDTO setTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacion) {
        this.tipoIdentificacion = obtenerValorDefecto(tipoIdentificacion, new TipoIdentificacionDTO());
        return this;
    }
}
