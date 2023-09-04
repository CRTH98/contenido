package org.crthCode.seccion8.Ejercicios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio3 {
    public static void main(String[] args) {
        Calendar fechaInicial = Calendar.getInstance();
        fechaInicial.set(Calendar.YEAR, 2023);
        fechaInicial.set(Calendar.MONTH, Calendar.SEPTEMBER);
        fechaInicial.set(Calendar.DAY_OF_MONTH, 9);



        int numeroDias = 10;

        Calendar fechaFutura = calcularFechaFutura(fechaInicial, numeroDias);

        SimpleDateFormat formato = new SimpleDateFormat("dd MMM yyyy");

        String fIncio = formato.format(fechaInicial.getTime());
        String fFutura = formato.format(fechaFutura.getTime());


        System.out.println("Fecha de inicio: " + fIncio);
        System.out.println("Número de días a incrementar: " + numeroDias);
        System.out.println("Fecha futura considerando días laborables: " + fFutura);
    }


    public static Calendar calcularFechaFutura(Calendar fechaInicio, int numeroDias){
        Calendar fechaFutura = (Calendar) fechaInicio.clone();

        for (int i = 0; i < numeroDias; i++) {
            fechaFutura.add(Calendar.DAY_OF_WEEK, 1);

            if (fechaFutura.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                fechaFutura.add(Calendar.DAY_OF_WEEK, 2);
            } else if (fechaFutura.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                fechaFutura.add(Calendar.DAY_OF_WEEK, 1);
            }
        }
        return fechaFutura;
    }
}

    /*
    Se define el método principal main que es el punto de entrada del programa.
    Se crea una instancia de la clase Calendar llamada fechaInicial y se inicializa con la fecha y hora actual.
    Se establece el año de la fecha inicial en 2023.
    Se establece el mes de la fecha inicial en septiembre (Calendar.SEPTEMBER es una constante que representa el mes de septiembre en Java).
    Se establece el día del mes de la fecha inicial en 9.
    Se declara e inicializa una variable llamada numeroDias con el valor 10.
    Se llama al método calcularFechaFutura pasando la fecha inicial y el número de días como argumentos, y se almacena el resultado en la variable fechaFutura.
    Se crea una instancia de SimpleDateFormat llamada formato para formatear las fechas en el formato "dd MMM yyyy" (día, mes abreviado y año).
    Se formatea la fecha inicial utilizando el formato definido y se almacena en la variable fIncio.
    Se formatea la fecha futura (calculada) utilizando el mismo formato y se almacena en la variable fFutura.
    Se imprime en la consola la fecha de inicio formateada.
    Se imprime en la consola el número de días a incrementar.
    Se imprime en la consola la fecha futura calculada y formateada.
    Se cierra el método main.
    Se define el método calcularFechaFutura, que toma una fecha inicial y un número de días como argumentos y devuelve un objeto Calendar.
    Se crea una copia de la fecha inicial para evitar modificar la fecha original.
    Se inicia un bucle que se ejecutará numeroDias veces.
    Se agrega un día a la fecha futura.
    Se verifica si la fecha futura es un sábado.
    Si la fecha futura es un sábado, se le suman 2 días adicionales para saltar el fin de semana.
    Si la fecha futura es un domingo, se le suma 1 día adicional para saltar el fin de semana.
    Fin de las condiciones dentro del bucle.
    Se devuelve la fecha futura después de calcularla.
    Se cierra el método calcularFechaFutura.
     */
