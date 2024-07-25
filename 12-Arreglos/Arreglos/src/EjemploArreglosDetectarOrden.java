import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 7 números: ");
        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }

        boolean asc = false;
        boolean desc = false;
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] > a[i+1]){
                desc = true;
            }
            if(a[i] < a[i+1]){
                asc = true;
            }
        }

        if(asc && desc){
            System.out.println("Arreglo = desordenado");
        }

        if(!asc && !desc){
            System.out.println("Arreglo = todos iguales");
        }

        if(asc && !desc){
            System.out.println("Arreglo = ordenado de forma ascendente");
        }

        if(!asc && desc){
            System.out.println("Arreglo = ordenado de forma descendente");
        }

    }
}
