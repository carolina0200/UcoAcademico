package co.edu.uco.ucoacademico.transversal.mensaje.implementacion;

import co.edu.uco.ucoacademico.transversal.mensaje.MensajeHelper;
import static co.edu.uco.ucoacademico.transversal.mensaje.codigomensaje.CodigosMensajes.*;

import co.edu.uco.ucoacademico.transversal.mensaje.codigomensaje.CodigosMensajes;
import co.edu.uco.ucoacademico.transversal.mensaje.dto.MensajeDTO;
import co.edu.uco.ucoacademico.transversal.mensaje.enumeraciones.CategoriaMensajeEnum;
import co.edu.uco.ucoacademico.transversal.mensaje.enumeraciones.TipoMensajeEnum;
import co.edu.uco.ucoacademico.transversal.utilitario.UtilTexto;
import co.edu.uco.ucoacademico.transversal.utilitario.excepcion.UcoAcademicoTransversalExcepcion;

import java.util.HashMap;
import java.util.Map;

public class CacheMensajeHelper extends MensajeHelper {

    private static final CacheMensajeHelper INSTANCIA = new CacheMensajeHelper();
    private static final Map<String,MensajeDTO> MAPA_MENSAJES = new HashMap<>();

    private CacheMensajeHelper() {
        cargarMensajes();
    }

    private void cargarMensajes() {
        MAPA_MENSAJES.put(UtilFechaMensajes.MEN_USU_PROBLEMAS_FORMATEANDO_FECHA,
                MensajeDTO.crear(UtilFechaMensajes.MEN_USU_PROBLEMAS_FORMATEANDO_FECHA,
                        TipoMensajeEnum.USUARIO,
                        CategoriaMensajeEnum.ERROR,
                        "Se ha presentado un problema tratando de llevar acabo la operacion deseada especificamente tratando de formatear la fecha"
                )
        );
        MAPA_MENSAJES.put(UtilFechaMensajes.MEN_TEC_PROBLEMAS_FORMATEANDO_FECHA,
                MensajeDTO.crear(UtilFechaMensajes.MEN_TEC_PROBLEMAS_FORMATEANDO_FECHA,
                        TipoMensajeEnum.TECNICO,
                        CategoriaMensajeEnum.ERROR,
                        "Se ha presentado un problema, tratando de formatear la fecha, porfavor verifique la excepcion"
                )
        );
        MAPA_MENSAJES.put(UtilFechaMensajes.MEN_USU_PROBLEMAS_FORMATEANDO_FECHA_INESPERADO,
                MensajeDTO.crear(UtilFechaMensajes.MEN_USU_PROBLEMAS_FORMATEANDO_FECHA_INESPERADO,
                        TipoMensajeEnum.USUARIO,
                        CategoriaMensajeEnum.ERROR,
                        "Se ha presentado un problema inesperado, tratando de formatear la fecha"
                )
        );
        MAPA_MENSAJES.put(UtilFechaMensajes.MEN_TEC_PROBLEMAS_FORMATEANDO_FECHA_INESPERADO,
                MensajeDTO.crear(UtilFechaMensajes.MEN_TEC_PROBLEMAS_FORMATEANDO_FECHA_INESPERADO,
                        TipoMensajeEnum.TECNICO,
                        CategoriaMensajeEnum.ERROR,
                        "Se ha presentado un problema inesperado, tratando de formatear la fecha, porfavor verifique la excepcion y controlela"
                )
        );
        MAPA_MENSAJES.put(CacheMensajeHelperMensajes.MEN_USU_PROBLEMAS_CODIGO_MENSAJE_NULO_VACIO,
                MensajeDTO.crear(CacheMensajeHelperMensajes.MEN_USU_PROBLEMAS_CODIGO_MENSAJE_NULO_VACIO,
                        TipoMensajeEnum.USUARIO,
                        CategoriaMensajeEnum.ERROR,
                        "Se ha presentado un problema tratando de llevar a cabo la operación, se intento obtener el mensaje con datos incosistentes"
                )
        );
        MAPA_MENSAJES.put(CacheMensajeHelperMensajes.MEN_TEC_PROBLEMAS_CODIGO_MENSAJE_NULO_VACIO,
                MensajeDTO.crear(CacheMensajeHelperMensajes.MEN_TEC_PROBLEMAS_CODIGO_MENSAJE_NULO_VACIO,
                        TipoMensajeEnum.TECNICO,
                        CategoriaMensajeEnum.ERROR,
                        "Se ha presentado un problema tratando recuperar un mensaje desde cache con un codigo nulo o vacio"
                )
        );
        MAPA_MENSAJES.put(CacheMensajeHelperMensajes.MEN_USU_PROBLEMAS_CODIGO_MENSAJE_NO_EXISTENTE,
                MensajeDTO.crear(CacheMensajeHelperMensajes.MEN_USU_PROBLEMAS_CODIGO_MENSAJE_NO_EXISTENTE,
                        TipoMensajeEnum.USUARIO,
                        CategoriaMensajeEnum.ERROR,
                        "Se ha presentado un problema tratando de llevar a cabo la operación, se intento obtener el mensaje con codigo incorrecto"
                )
        );
        MAPA_MENSAJES.put(CacheMensajeHelperMensajes.MEN_TEC_PROBLEMAS_CODIGO_MENSAJE_NO_EXISTENTE,
                MensajeDTO.crear(CacheMensajeHelperMensajes.MEN_TEC_PROBLEMAS_CODIGO_MENSAJE_NO_EXISTENTE,
                        TipoMensajeEnum.TECNICO,
                        CategoriaMensajeEnum.ERROR,
                        "Se ha presentado un problema tratando recuperar un mensaje desde cache con un codigo que no existe"
                )
        );

    }

    public static CacheMensajeHelper obtenerCacheMensajeHelper() {
        return INSTANCIA;
    }

    @Override
    public MensajeDTO obtenerMensaje(String codigo) {
        if (UtilTexto.cadenaEstaVaciaONula(codigo)) {
            throw UcoAcademicoTransversalExcepcion.crear(
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(CacheMensajeHelperMensajes.MEN_USU_PROBLEMAS_CODIGO_MENSAJE_NULO_VACIO),
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(CacheMensajeHelperMensajes.MEN_TEC_PROBLEMAS_CODIGO_MENSAJE_NULO_VACIO)
            );
        }

        if(MAPA_MENSAJES.containsKey(codigo)) {
            throw UcoAcademicoTransversalExcepcion.crear(
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(CacheMensajeHelperMensajes.MEN_USU_PROBLEMAS_CODIGO_MENSAJE_NO_EXISTENTE),
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(CacheMensajeHelperMensajes.MEN_TEC_PROBLEMAS_CODIGO_MENSAJE_NO_EXISTENTE)
            );
        }

        return MAPA_MENSAJES.get(codigo);
    }

    @Override
    public String obtenerTextoMensaje(String codigo) {
        return obtenerMensaje(codigo).getMensaje();
    }
}
