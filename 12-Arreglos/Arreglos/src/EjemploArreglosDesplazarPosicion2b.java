import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2b {
    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento, posicion, ultimo;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++) {
            System.out.print("Ingrese el número: ");
            a[i] = s.nextInt();
        }

        System.out.print("Nuevo elemento: ");
        elemento = s.nextInt();

        System.out.print("Posición donde agregar (0 - 9): ");
        posicion = s.nextInt();

        ultimo = a[a.length-1];
        for (int i = a.length - 2; i >= posicion; i--){
            a[i+1] = a[i];
        }
        int[] b = new int [a.length+1];
        System.arraycopy(a, 0,  b, 0, a.length);
        a = b;
        a[posicion] = elemento;

        a[a.length-1] = ultimo;

        System.out.print("\nEl arreglo: ");
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }



    }
}
