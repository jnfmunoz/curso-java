import java.util.Scanner;
public class OperadorTernario {
    public static void main(String[] args) {

        String variable = 7 == 7 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la nota de matemáticas: ");
        matematicas = s.nextDouble();

        System.out.println("Ingrese la nota de ciencias: ");
        ciencias = s.nextDouble();

        System.out.println("Ingrese la nota de historia: ");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "Aprobado" : "Reprobado";
        System.out.println("estado = " + estado);

        /* if(promedio >= 5.49){
            estado = "Aprobado";
            System.out.println("estado = " + estado);
        }
        else{
            estado = "Reprobado";
            System.out.println("estado = " + estado);
        } */

    }
}
