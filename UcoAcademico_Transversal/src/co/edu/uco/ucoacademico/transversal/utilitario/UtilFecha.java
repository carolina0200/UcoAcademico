package co.edu.uco.ucoacademico.transversal.utilitario;

import co.edu.uco.ucoacademico.transversal.mensaje.MensajeHelper;
import static co.edu.uco.ucoacademico.transversal.mensaje.codigomensaje.CodigosMensajes.UtilFechaMensajes;
import co.edu.uco.ucoacademico.transversal.utilitario.excepcion.UcoAcademicoTransversalExcepcion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import static java.util.Calendar.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class UtilFecha {

    private static final String FECHA_DEFECTO = "01/01/1960";
    private static final String FORMATO_DD_MM_YYYY = "dd/MM/yyyy";

    private UtilFecha() {}

    public static Date obtenerFechaDefecto(Date fecha, Date valorDefecto) {
        return UtilObjeto.obtenerValorDefecto(fecha, valorDefecto);
    }

    public static Date obtenerFechaDefecto(Date fecha) {
        return UtilObjeto.obtenerValorDefecto(fecha, obtenerFechaPorDefecto());
    }

    public static Date obtenerFechaActual() {
        return new Date();
    }

    public static Date obtenerFechaPorDefecto() {
        return formatearFecha(FECHA_DEFECTO, FORMATO_DD_MM_YYYY);
    }

    public static Date formatearFecha(String fechaTexto, String formato) {
        try {
            SimpleDateFormat formateador = new SimpleDateFormat(formato);
            return formateador.parse(fechaTexto);
        } catch (ParseException excepcion) {
            throw UcoAcademicoTransversalExcepcion.crear(
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(UtilFechaMensajes.MEN_USU_PROBLEMAS_FORMATEANDO_FECHA),
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(UtilFechaMensajes.MEN_TEC_PROBLEMAS_FORMATEANDO_FECHA)
            );
        } catch (Exception excepcion) {
            throw UcoAcademicoTransversalExcepcion.crear(
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(UtilFechaMensajes.MEN_USU_PROBLEMAS_FORMATEANDO_FECHA_INESPERADO),
                    MensajeHelper.obtenerMensajeHelper().obtenerTextoMensaje(UtilFechaMensajes.MEN_TEC_PROBLEMAS_FORMATEANDO_FECHA_INESPERADO)
            );
        }
    }

    public static int calcularAniosDiferencia(Date fechaInicial, Date fechaFinal) {
        Calendar inicial = getCalendar(fechaInicial);
        Calendar finald = getCalendar(fechaFinal);
        int diff = finald.get(YEAR) - inicial.get(YEAR);
        if (inicial.get(MONTH) > finald.get(MONTH) ||
                (inicial.get(MONTH) == finald.get(MONTH) && inicial.get(DATE) > finald.get(DATE))) {
            diff--;
        }
        return diff;
    }

    public static int calcularAniosDiferenciaContraFechaActual(Date fecha) {
        return calcularAniosDiferencia(fecha, obtenerFechaActual());
    }

    public static Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }

}
