import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Tarea11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese fecha de nacimiento con formato 'yyyy-MM-dd': ");
        try {
            Date fechaAct = new Date();
            Date fechaNac = format.parse(s.next());

            double diaMillisecond = 8.64e+7;
            double dias = Math.round((fechaAct.getTime() - fechaNac.getTime()) / diaMillisecond);
            double years = dias/365;
            
            double yearsTruncated = truncar(years, 0);
            System.out.println("La edad del usuario es: " + yearsTruncated);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
    
    // Función para truncar un número double a un número específico de decimales
    public static double truncar(double valor, int decimales) {
        double factor = Math.pow(10, decimales);
        return Math.floor(valor * factor) / factor;
    }
}
