package org.crthCode.seccion8.Ejercicios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ejercicio2 {
    public static void main(String[] args) {
        // Obtener una instancia del calendario
        Calendar cal = Calendar.getInstance();
        // Establecer la fecha en el calendario (2000 - Abril - 10)
        establecerFecha(cal, 2000, Calendar.APRIL, 10);
        // Crear un formato de fecha específico ("yyyy-MM-dd")
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // Obtener la fecha actual como objeto Date
        Date fecha = cal.getTime();
        // Formatear la fecha como una cadena de texto
        String fechaInicial = formatoFecha(fecha, sdf);
        // Imprimir la fecha inicial formateada
        System.out.println("Fecha Inicial: " + fechaInicial);
        // Agregar 10 días a la fecha del calendario
        agregarDias(cal, 10);
        // Obtener la fecha modificada como objeto Date
        Date fecha1 = cal.getTime();
        // Formatear la fecha modificada como una cadena de texto
        String fechaModi = formatoFecha(fecha1, sdf);
        // Imprimir la fecha modificada formateada
        System.out.println("Fecha Modificada: " + fechaModi);
    }
    // Método para establecer una fecha en el calendario
    public static void establecerFecha(Calendar cal, int anio, int mes, int dia){
        cal.set(Calendar.YEAR, anio);
        cal.set(Calendar.MONTH, mes);
        cal.set(Calendar.DAY_OF_MONTH, dia);
    }
    // Método para agregar días al calendario
    public static void agregarDias(Calendar cal, int dias){
        cal.add(Calendar.DAY_OF_MONTH,dias);
    }
    // Método para formatear una fecha como cadena de texto
    public static String formatoFecha(Date fecha, SimpleDateFormat sf){
        return sf.format(fecha);
    }

}
