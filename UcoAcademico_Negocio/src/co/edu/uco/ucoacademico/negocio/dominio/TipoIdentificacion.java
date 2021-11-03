package co.edu.uco.ucoacademico.negocio.dominio;

import static co.edu.uco.ucoacademico.transversal.utilitario.UtilTexto.aplicarTrim;

public class TipoIdentificacion {

    private int codigo;
    private String nombre;

    public TipoIdentificacion() { }

    public TipoIdentificacion(int codigo, String nombre) {
        setCodigo(codigo);
        setNombre(nombre);
    }

    public static TipoIdentificacion crear() {
        return new TipoIdentificacion();
    }


    public int getCodigo() {
        return codigo;
    }

    public TipoIdentificacion setCodigo(int codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoIdentificacion setNombre(String nombre) {
        this.nombre = aplicarTrim(nombre);
        return this;
    }
}
