import java.util.Scanner;

public class Tarea4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número 1: ");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese número 2: ");
        double num2 = scanner.nextDouble();

        String resultado = (num1>num2) ? num1 + " y " + num2 : num2 + " y " + num1;
        System.out.println(resultado);

    }
}
