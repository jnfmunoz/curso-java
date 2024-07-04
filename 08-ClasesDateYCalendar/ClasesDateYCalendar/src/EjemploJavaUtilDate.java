import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        // https://docs.oracle.com/en%2Fjava%2Fjavase%2F22%2Fdocs%2Fapi%2F%2F/java.base/java/text/SimpleDateFormat.html

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        df = new SimpleDateFormat("dd-MMM-yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        df = new SimpleDateFormat("dd-MM-yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        df = new SimpleDateFormat("dd/MM/yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        df = new SimpleDateFormat("EEEE dd 'de' MMMM 'de' yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        long j = 0;
        for(int i=0; i < 10000000; i++){
            j+=i;
        }
        System.out.println("j = " + j);

        Date fecha2 = new Date();

        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("tiempo transcurrido en el ciclo for = " + tiempoFinal);

    }
}
