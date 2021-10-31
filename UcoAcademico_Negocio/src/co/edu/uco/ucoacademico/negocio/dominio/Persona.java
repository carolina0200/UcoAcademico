package co.edu.uco.ucoacademico.negocio.dominio;

import co.edu.uco.ucoacademico.transversal.utilitario.UtilFecha;

import java.util.Date;

public class Persona {
    private int codigo;
    private String nombre;
    private String email;
    private Date fechaNacimiento;
    private TipoIdentificacion tipoIdentificacion;

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
        this.nombre = nombre;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Persona setEmail(String email) {
        this.email = email;
        return this;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Persona setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public Persona setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
        return this;
    }
}
