package seccion8.ejercicios_test;

import org.crthCode.seccion8.Ejercicios.Ejercicio3;
import org.crthCode.seccion8.date_Calendar.Calendario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ejercicio3_test {
    private SimpleDateFormat formato  = new SimpleDateFormat("dd MMM yyyy");
    private Calendar fechaInicial;


    @BeforeEach
    public void setUp() {
        fechaInicial = Calendar.getInstance();
        fechaInicial.set(Calendar.YEAR, 2023);
        fechaInicial.set(Calendar.MONTH, Calendar.SEPTEMBER);
        fechaInicial.set(Calendar.DAY_OF_MONTH, 9);
    }

    @Test
    public void testCalcularFechaFutura() {
        Calendar fechaFutura = Ejercicio3.calcularFechaFutura(fechaInicial, 10);
        String fFutura = formato.format(fechaFutura.getTime());
        assertEquals("22 set. 2023", fFutura);
    }
    @Test
    public void testCalcularFechaFuturaConDiasCero() {

        Calendar fechaFutura = Ejercicio3.calcularFechaFutura(fechaInicial, 0);

        String fFutura = formato.format(fechaFutura.getTime());
        String fIncio = formato.format(fechaInicial.getTime());
        assertEquals(fIncio, fFutura);
    }

}

/*
Importaciones necesarias:
Se importan las clases necesarias, como SimpleDateFormat, Calendar, Date, y las clases de JUnit.

Declaración de variables:
Se declara una instancia de SimpleDateFormat para formatear fechas.
Se declara una instancia de Calendar llamada fechaInicial que se utilizará en los tests.

Método setUp():
Se utiliza el método setUp() anotado con @BeforeEach para realizar la configuración inicial antes de cada test.
Se crea la instancia de fechaInicial con la fecha "09 Sep 2023" para ser utilizada en los tests.

Test testCalcularFechaFutura:
Se crea un método de prueba anotado con @Test para probar el método calcularFechaFutura.
Se llama al método Ejercicio3.calcularFechaFutura con la fechaInicial y un número de días igual a 10.
Se formatea la fecha futura resultante como una cadena.
Se utiliza assertEquals para verificar que la fecha futura es igual a "21 Sep 2023".

Test testCalcularFechaFuturaConDiasCero:
Se crea otro método de prueba anotado con @Test para probar el caso en el que el número de días es igual a 0.
Se llama al método Ejercicio3.calcularFechaFutura con la fechaInicial y un número de días igual a 0.
Se formatea la fecha futura resultante y la fecha inicial como cadenas.
Se utiliza assertEquals para verificar que la fecha futura es igual a la fecha inicial.
 */
