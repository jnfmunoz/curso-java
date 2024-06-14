import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre1;
        String nombre2;
        String nombre3;

        System.out.println("Ingrese el primer nombre: ");
        nombre1 = scanner.nextLine();

        System.out.println("Ingrese el segundo nombre: ");
        nombre2 = scanner.nextLine();

        System.out.println("Ingrese el tercer nombre: ");
        nombre3 = scanner.nextLine();

        String manejo_nombre1 = Character.toUpperCase(nombre1.charAt(1)) + "." + nombre1.substring(nombre1.length()-2);
        String manejo_nombre2 = Character.toUpperCase(nombre2.charAt(1)) + "." + nombre2.substring(nombre2.length()-2);
        String manejo_nombre3 = Character.toUpperCase(nombre3.charAt(1)) + "." + nombre3.substring(nombre3.length()-2);

        String resultado = manejo_nombre1 + "_" + manejo_nombre2 + "_" + manejo_nombre3;
        System.out.println(resultado);
    }
}
