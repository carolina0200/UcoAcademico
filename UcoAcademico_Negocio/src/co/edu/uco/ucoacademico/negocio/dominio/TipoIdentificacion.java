package co.edu.uco.ucoacademico.negocio.dominio;

public class TipoIdentificacion {
    private int codigo;
    private String nombre;

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
        this.nombre = nombre;
        return this;
    }
}
