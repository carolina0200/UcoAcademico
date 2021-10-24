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
}
