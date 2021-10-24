package co.edu.uco.ucoacademico.transversal.mensaje;

import co.edu.uco.ucoacademico.transversal.mensaje.dto.MensajeDTO;
import co.edu.uco.ucoacademico.transversal.mensaje.enumeraciones.MensajeHelperEnum;
import co.edu.uco.ucoacademico.transversal.mensaje.implementacion.CacheMensajeHelper;

public abstract class MensajeHelper {
    public static MensajeHelperEnum ESTRATEGIA = MensajeHelperEnum.CACHE;
    public static MensajeHelper obtenerMensajeHelper() {
        MensajeHelper mensajeHelper = CacheMensajeHelper.obtenerCacheMensajeHelper();

        /* switch (ESTRATEGIA) {
            case ARCHIVO, BASE_DATOS, SERVICIO_WEB, CACHE:
                mensajeHelper = CacheMensajeHelper.obtenerCacheMensajeHelper();
                break;
        } */

        return mensajeHelper;
    }

    public abstract MensajeDTO obtenerMensaje(String codigo);

    public abstract String obtenerTextoMensaje(String codigo);
}
