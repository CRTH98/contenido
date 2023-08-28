package org.crthCode.seccion8.date_Calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class milisegundosGetTime {
    public static void main(String[] args) {
        //formato de la fecha
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, yyyy-MMMM-dd, HH:mm:ss");
        String dateString = sdf.format(date);

        //tiempo del milisegundos
        long j = 0;
        for (int i = 0; i < 10000000; i++) {
            j += i;
        }

        //tiempo transcurrido del milisegundos
        Date date1 = new Date();
        long tiempofinal = date1.getTime() - date.getTime();

        //Resultado
        String outputFormat = "%-35s= %s%n";
        System.out.printf(outputFormat, "date:", date);
        System.out.printf(outputFormat, "Fecha y hora:", dateString);
        System.out.printf(outputFormat, "j:", j);
        System.out.printf(outputFormat, "Tiempo transcurrido en el for:", tiempofinal);

    }
}
