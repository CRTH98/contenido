package org.crthCode.seccion8.Ejercicios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//Suma 5 días a una fecha utilizando Calendar. codigo java
public class Ejercicio1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, Calendar.AUGUST );
        cal.set(Calendar.DAY_OF_MONTH, 10);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = cal.getTime();
        String date = sdf.format(d);
        System.out.println("date = " + date);

        cal.add(Calendar.DAY_OF_MONTH, 5);
        Date d1 = cal.getTime();
        String date1 = sdf.format(d1);
        System.out.println("date = " + date1);
    }
}
