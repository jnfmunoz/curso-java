import java.util.Scanner;

public class Tarea7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int cantidad;
        System.out.println("Ingrese cantidad de números a comparar(mín 10): ");
        cantidad = s.nextInt();

        if(cantidad>=10){
            int[] numbers = new int[cantidad];

            for(int i=0; i < numbers.length; i++){
                System.out.println("Ingrese número para la posición " + (i + 1) + ": ");
                numbers[i] = s.nextInt();
            }

            int minNumber = numbers[0];

            for(int j=1; j < numbers.length; j++){
                if(numbers[j] < minNumber){
                    minNumber = numbers[j];
                }
            }

            System.out.println("Listado de números");
            for(int number:numbers){
                System.out.println(number);
            }

            if(minNumber < 10){
                System.out.println("El número menor es menor a 10!");
            } else {
                System.out.println("El número menor es mayor a 10!");
            }

            System.out.println("El número menor es " + minNumber);
        } else {
            System.out.println("La cantidad mínima de números a comparar debe ser 10!");
        }
    }
}
