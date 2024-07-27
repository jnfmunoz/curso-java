import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento, posicion;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length-1; i++) {
            System.out.print("Ingrese el número: ");
            a[i] = s.nextInt();
        }

        System.out.print("Nuevo elemento: ");
        elemento = s.nextInt();

        System.out.print("Posición donde agregar (0 - 9): ");
        posicion = s.nextInt();

        for (int i = a.length - 2; i >= posicion; i--){
            a[i+1] = a[i];
        }
        a[posicion] = elemento;

        System.out.print("\nEl arreglo: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

    }
}
