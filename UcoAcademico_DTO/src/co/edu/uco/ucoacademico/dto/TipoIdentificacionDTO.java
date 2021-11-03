package co.edu.uco.ucoacademico.dto;

import static co.edu.uco.ucoacademico.transversal.utilitario.UtilTexto.aplicarTrim;

public class TipoIdentificacionDTO {

    private int codigo;
    private String nombre;

    public TipoIdentificacionDTO() { }

    public TipoIdentificacionDTO(int codigo, String nombre) {
        setCodigo(codigo);
        setNombre(nombre);
    }

    public static TipoIdentificacionDTO crear() {
        return new TipoIdentificacionDTO();
    }

    public int getCodigo() {
        return codigo;
    }

    public TipoIdentificacionDTO setCodigo(int codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoIdentificacionDTO setNombre(String nombre) {
        this.nombre = aplicarTrim(nombre);
        return this;
    }
}
