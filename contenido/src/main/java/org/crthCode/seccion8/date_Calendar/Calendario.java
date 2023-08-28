package org.crthCode.seccion8.date_Calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendario {
    public static void main(String[] args) {
        // Crear una instancia de Calendar que representa la fecha y hora actual del sistema.
        Calendar calendar = Calendar.getInstance();
        // Configurar la instancia del calendario para que represente el 25 de enero de 2020.

        // calendar.set(2020, 0, 25,19,20,40);
        //  calendar.set(2020, Calendar.APRIL, 25,19,20,40); // El segundo argumento (0) representa enero.

        //otra opcion con constantes
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, Calendar.APRIL);
        calendar.set(Calendar.DAY_OF_MONTH, 25);

        calendar.set(Calendar.HOUR, 7);
        calendar.set(Calendar.AM_PM, Calendar.AM);
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.SECOND, 50);
        calendar.set(Calendar.MILLISECOND, 458);

        // Obtener un objeto Date a partir de la configuración del calendario.
        Date fecha = calendar.getTime();
        // Crear una instancia de SimpleDateFormat para formatear la fecha en un formato específico.
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd-MM-yyyy, hh:mm:ss:SSS");

        // Formatear la fecha (Date) en un formato de cadena utilizando el formato definido.
        String dateString = sdf.format(fecha);

        // Definir un formato de salida para el printf.
        String outputFormat = "%-15s= %s%n";

        // Imprimir la fecha formateada junto con la etiqueta "Fecha:" utilizando printf.
        System.out.printf(outputFormat, "Fecha:", dateString);
    }
}
