package org.crthCode.seccion8.date_Calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatoFecha {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println("date = " + date);
        System.out.println("date.toString() = " + date.toString());
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = dateFormat.format(date);
        System.out.println("dateString = " + dateString);

        dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ssss");
        String dateString1 = dateFormat.format(date);
        System.out.println("dateString1 = " + dateString1);

    }
}
