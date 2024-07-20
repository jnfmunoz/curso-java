import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7];

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Jeep";

        int total = productos.length;
        Arrays.sort(productos);

        System.out.println("------ Usando For ------");
        for(int i = 0; i < total; i++ ){
            System.out.println("para índice = " + i + ": " + productos[i]);
        }

        System.out.println("------ Usando For Each ------");
        for(String prod:productos){
            System.out.println("prod = " + prod);
        }

        System.out.println("------ Usando While ------");
        int i = 0;
        while(i < total){
            System.out.println("para índice = " + i + ": " + productos[i]);
            i++;
        }

        System.out.println("------ Usando Do While ------");
        int j = 0;
        do{
            System.out.println("para índice = " + j + ": " + productos[j]);
            j++;
        }while(j < total);

        int[] numbers = new int[10];

        int totalNumbers = numbers.length;
        for(int k = 0; k < totalNumbers; k++){
            numbers[k] = k*3;
        }

        for(int k = 0; k < totalNumbers; k++){
            System.out.println("numbers[k] = " + numbers[k]);
        }

    }

}
