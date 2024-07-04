import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        // calendario.set(2020, 00, 25, 19, 20, 10);
        // calendario.set(2020, Calendar.JANUARY, 25);

        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);

        // calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("fechaWithoutFormat = " + fecha);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaWithFormat = format.format(fecha);
        System.out.println("fechaWithFormat = " + fechaWithFormat);

        Calendar calActual = Calendar.getInstance();
        Date fecha2 = calActual.getTime();

        if(fecha.after(fecha2)){
            System.out.println("fecha1 (del usuario) es posterior a la fecha2 (actual)");
        }else if(fecha.before(fecha2)){
            System.out.println("fecha1 (del usuario) es anterior a la fecha2 (actual)");
        }else if(fecha.equals(fecha2)){
            System.out.println("fecha1 (del usuario) es igual a fecha2 (actual)");
        }

        if(fecha.compareTo(fecha2) > 0){
            System.out.println("fecha1 (del usuario) es posterior a la fecha2(actual)");
        } else if (fecha.compareTo(fecha2) < 0) {
            System.out.println("fecha1 (del usuario) es anterior a la fecha2(actual)");
        } else if (fecha.compareTo(fecha2) == 0){
            System.out.println("fecha1 (del usuario) es igual a fecha2(actual)");
        }

    }
}
