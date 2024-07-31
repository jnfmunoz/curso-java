import java.util.Scanner;

public class Tarea14 {
    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 7 números de rango (11 - 99):");
        for(int i = 0; i < a.length; i++){
            int numero = s.nextInt();
            if(numero >= 11 && numero <= 99) {
                a[i] = numero;
            }
            else{
                System.out.println("Número fuera de rango, ingrese nuevo número de rango (11 - 99): ");
                i--;
            }

        }

        int max = 0;
        for(int i = 0; i < a.length; i++){
            max = a[max] > a[i] ? max : i;
        }
        System.out.println("el número mayor es: " + a[max]);
    }
}
