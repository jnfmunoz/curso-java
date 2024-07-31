import java.util.Scanner;

public class Tarea15 {
    public static void main(String[] args) {
        int[] a = new int[7];
        Scanner s = new Scanner(System.in);
        int total = a.length;
        int sumaPositivo = 0, sumaNegativo = 0;
        int totalPositivo = 0, totalNegativo = 0, totalCeros = 0;
        double promedioPositivo = 0, promedioNegativo = 0;

        System.out.println("Ingrese 7 números enteros (Z = { -∞,-3,-2,-1,0,1,2,3,∞ }): ");
        for(int i = 0; i < total; i++){
            a[i] = s.nextInt();
        }

        for (int j : a) {
            if (j > 0) {
                sumaPositivo += j;
                totalPositivo += 1;
            } else if (j < 0) {
                sumaNegativo += j;
                totalNegativo += 1;
            } else if (j == 0) {
                totalCeros +=1;
            }
        }

        promedioPositivo = (double) sumaPositivo / totalPositivo;
        promedioNegativo = (double) sumaNegativo / totalNegativo;

        System.out.println("el promedio de números positivos es: " + promedioPositivo);
        System.out.println("el promedio de números negativos es: " + promedioNegativo);
        System.out.println("la cantidad de números 0 es: " + totalCeros);

    }
}