import java.util.Scanner;

public class Tarea9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x;
        int y;
        int z = 0;

        System.out.println("Ingrese número 1: ");
        x = s.nextInt();

        System.out.println("Ingrese número 2: ");
        y = s.nextInt();

        for(int i = 1; i <= y; i++){
            z+=x;
        }

        System.out.println("El resultado de la multiplicación entre " + x + " y " + y + " es: " + z);
    }
}
