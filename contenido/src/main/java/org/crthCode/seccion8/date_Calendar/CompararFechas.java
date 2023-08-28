package org.crthCode.seccion8.date_Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CompararFechas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Ingresa una fecha: ");
        try{
            Date fecha = sf.parse(scanner.next());
            System.out.println("sf = " + sf.format(fecha));

            Date fecha2 = new Date();
            System.out.println("fecha2 = " + fecha2);

            if (fecha.after( fecha2 )){
                System.out.println("fecha 1 del usuario es despues que fecha2 ");
            } else if ( fecha.before( fecha2 )){
                System.out.println("Fecha 1 es anterior de fecha2");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Fecha 1 es igual de fecha2");
            }

        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}

