package org.crthCode.seccion8.date_Calendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        String fechaStr;
        int desde, hasta, edad;

        System.out.println("ingrese fecha de nacimiento en formato yyyy MM dd");
        fechaStr = scanner.next();

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date nacimiento = df.parse(fechaStr);

        Date fActual = new Date();

        df = new SimpleDateFormat("yyyyMMdd");

        desde = Integer.parseInt(df.format(nacimiento));
        hasta = Integer.parseInt(df.format(fActual));

        edad = (hasta - desde) / 10000;

        System.out.println("Edad = " + edad);
    }
}
