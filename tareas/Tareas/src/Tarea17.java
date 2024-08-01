public class Tarea17 {
    public static void main(String[] args) {

        // int[] a = new int[12];
        int[] a = { 4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1 };
        int[] frecuencias = new int[6];

        // contar las frecuencias
        for (int i = 0; i < a.length; i++) {
            int numero = a[i];
            if (numero >= 1 && numero <= 6) {
                frecuencias[numero - 1]++;
            }
        }

        // Imprimir el histograma
        for (int i = 0; i < frecuencias.length; i++) {
            int numero = i + 1;
            int frecuencia = frecuencias[i];
            System.out.print(numero + ": ");
            for (int j = 0; j < frecuencia; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
