import java.util.Scanner;

public class Tarea12 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double radio;
        double area = 0;

        System.out.println("Ingrese radio del círculo: ");
        radio = s.nextDouble();

        area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área del círculo es: " + area);
        
    }
}
