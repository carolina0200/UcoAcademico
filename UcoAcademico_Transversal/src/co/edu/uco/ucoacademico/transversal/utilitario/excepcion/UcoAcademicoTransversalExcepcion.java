package co.edu.uco.ucoacademico.transversal.utilitario.excepcion;

import static co.edu.uco.ucoacademico.transversal.utilitario.UtilTexto.aplicarTrim;
import static co.edu.uco.ucoacademico.transversal.utilitario.UtilObjeto.obtenerValorDefecto;

public class UcoAcademicoTransversalExcepcion extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String mensajeUsuario;
    private String mensajeTecnico;
    private Throwable excepcionRaiz;

    private UcoAcademicoTransversalExcepcion(String mensajeUsuario, String mensajeTecnico, Throwable excepcionRaiz) {
        setMensajeUsuario(mensajeUsuario);
        setMensajeTecnico(mensajeTecnico);
        setExcepcionRaiz(excepcionRaiz);
    }

    public static UcoAcademicoTransversalExcepcion crear(String mensajeUsuario, String mensajeTecnico, Throwable excepcionRaiz) {
        return new UcoAcademicoTransversalExcepcion(mensajeUsuario, mensajeTecnico, excepcionRaiz);
    }

    public static UcoAcademicoTransversalExcepcion crear(String mensajeUsuario, String mensajeTecnico) {
        return new UcoAcademicoTransversalExcepcion(mensajeUsuario, mensajeTecnico, new Exception(mensajeTecnico));
    }

    public String getMensajeUsuario() {
        return mensajeUsuario;
    }

    private void setMensajeUsuario(String mensajeUsuario) {
        this.mensajeUsuario = aplicarTrim(mensajeUsuario);
    }

    public String getMensajeTecnico() {
        return mensajeTecnico;
    }

    private void setMensajeTecnico(String mensajeTecnico) {
        this.mensajeTecnico = aplicarTrim(mensajeTecnico);
    }

    public Throwable getExcepcionRaiz() {
        return excepcionRaiz;
    }

    private void setExcepcionRaiz(Throwable excepcionRaiz) {
        this.excepcionRaiz = obtenerValorDefecto(excepcionRaiz, new Exception());
    }
}
