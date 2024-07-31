import java.util.Scanner;

public class Tarea13 {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número: ");
            a[i] = s.nextInt();
        }

        // Invertir el array
        int total = a.length;
        for(int i = 0; i < total / 2; i++){
            int temp = a[i];
            a[i] = a[total - i - 1];
            a[total - i - 1] = temp;
        }

        // Imprimir el array
        for(int i = 0; i < total; i++){
            System.out.println("[" + i + "] => " + a[i]);
        }

    }
}
