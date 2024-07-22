import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {

    public static void arregloInverso(String[] arreglo){

        int total2 = arreglo.length;
        int total = arreglo.length;
        for(int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total-1-i];
            arreglo[i] = inverso;
            arreglo[total-1-i] = actual;
            total2--;
        }
    }

    public static void sortBurbuja(Object[] arreglo){

        int total = arreglo.length;
        int contador = 0;

        for(int i = 0; i < total - 1; i++){

            for(int j = 0; j < total - 1 - i; j++){
                // if( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) > 0)  { // desc.
                if( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0)  { // asc.
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }
    }

    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook", "Macbook Air",
                "Chromecast 4ta generación", "Bicicleta Jeep"};

        int total = productos.length;

        sortBurbuja(productos);

        System.out.println("------ Usando For ------");
        for(int i = 0; i < total; i++ ){
            System.out.println("para índice = " + i + ": " + productos[i]);
        }

        Integer[] numbers = new Integer[4];
        int totalNumbers = numbers.length;

        numbers[0] = 1;
        numbers[1] = Integer.parseInt("2");
        numbers[2] = (int)35L;
        numbers[3] = -1;

        sortBurbuja(numbers);

        for(int i = 0; i < totalNumbers; i++) {
            System.out.println("i = " + i + ": " + numbers[i]);
        }
    }
}
