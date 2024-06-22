import java.util.Scanner;

public class Tarea5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese capacidad actual del estanque: ");
        int capacidad = scanner.nextInt();

        if (capacidad >= 1 && capacidad < 20) {
            System.out.println("Insuficiente");
        } else if (capacidad >= 20 && capacidad < 35) {
        System.out.println("Suficiente");
        } else if (capacidad >=35 && capacidad < 40) {
            System.out.println("Medio Estanque");
        } else if (capacidad >= 40 && capacidad < 60) {
            System.out.println("Estanque 3/4");
        } else if (capacidad >= 60 && capacidad < 70) {
            System.out.println("Estanque casi lleno");
        } else if (capacidad == 70) {
            System.out.println("Estanque lleno");
        }
    }
}
