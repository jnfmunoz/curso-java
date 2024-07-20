import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        // String[] productos = new String[7];
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo", "Asus Notebook", "Macbook Air",
                "Chromecast 4ta generación", "Bicicleta Jeep"};

        /* productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Jeep"; */

        int total = productos.length;
        Arrays.sort(productos);

        System.out.println("------ Usando For ------");
        for(int i = 0; i < total; i++ ){
            System.out.println("para índice = " + i + ": " + productos[i]);
        }

        System.out.println("------ Usando For Inverso ------");
        for(int i = 0; i < total; i++){
            System.out.println("para i: " + (total-1-i) + " valor: " + productos[total-1-i]);
        }

        System.out.println("------ Usando For Inverso 2 ------");
        for(int i = total - 1; i >= 0; i--){
            System.out.println("para i : " + i + ": " + productos[i]);
        }
    }

}
