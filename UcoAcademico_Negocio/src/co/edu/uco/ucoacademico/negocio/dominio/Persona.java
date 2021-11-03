package co.edu.uco.ucoacademico.negocio.dominio;
import co.edu.uco.ucoacademico.transversal.utilitario.UtilFecha;

import java.util.Date;

import static co.edu.uco.ucoacademico.transversal.utilitario.UtilFecha.obtenerFechaDefecto;
import static co.edu.uco.ucoacademico.transversal.utilitario.UtilObjeto.obtenerValorDefecto;
import static co.edu.uco.ucoacademico.transversal.utilitario.UtilTexto.aplicarTrim;

public class Persona {
    private int codigo;
    private String nombre;
    private String email;
    private Date fechaNacimiento;
    private TipoIdentificacion tipoIdentificacion;

    public Persona() { }

    public Persona(int codigo, String nombre, String email, Date fechaNacimiento, TipoIdentificacion tipoIdentificacion) {
        setCodigo(codigo);
        setNombre(nombre);
        setEmail(email);
        setFechaNacimiento(fechaNacimiento);
        setTipoIdentificacion(tipoIdentificacion);
    }

    public static Persona crear() {
        return new Persona();
    }

    public int getEdad() {
        return UtilFecha.calcularAniosDiferenciaContraFechaActual(fechaNacimiento);
    }

    public int getCodigo() {
        return codigo;
    }

    public Persona setCodigo(int codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona setNombre(String nombre) {
        this.nombre = aplicarTrim(nombre);
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Persona setEmail(String email) {
        this.email = aplicarTrim(email);
        return this;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Persona setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = obtenerFechaDefecto(fechaNacimiento);
        return this;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public Persona setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = obtenerValorDefecto(tipoIdentificacion, new TipoIdentificacion());
        return this;
    }
}
