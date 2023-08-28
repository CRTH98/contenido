package org.crthCode.seccion8.date_Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateParse_java {
    public static void main(String[] args) {
    /*
    Crea una instancia de Scanner para leer la entrada del usuario desde la consola.
    Crea una instancia de SimpleDateFormat con un patrón de formato de fecha "dd-MM-yyyy".
    Solicitar el ingreso de una fecha con el formato
    Utiliza un bloque try para manejar posibles excepciones.
        Lee una cadena de entrada del usuario y la convierte en un objeto Date utilizando el formato definido.
        Imprime la fecha en su forma de objeto Date.
        Formatea la fecha utilizando el formato definido y luego la imprime.
    Si ocurre un error al analizar la fecha, se captura y se imprime el rastro de error.
    */

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Ingresa una fecha: ");
        try{
            Date fecha = sf.parse(scanner.next());
            System.out.println("fecha = " + fecha);
            System.out.println("sf = " + sf.format(fecha));
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
