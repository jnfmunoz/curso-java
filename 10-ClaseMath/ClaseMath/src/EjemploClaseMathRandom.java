import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        double random = Math.random();
        System.out.println("random = " + random); // n random entre 0 y 1, excluyendo el 1

        random *= colores.length;
        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]);

        Random randomObj = new Random();
        // int randomInt = randomObj.nextInt();
        // int randomInt = randomObj.nextInt(); // rango entre 0 y 7, excluyendo el 7
        int randomInt = 15 + randomObj.nextInt(25 - 15);
        System.out.println("randomInt = " + randomInt);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);

    }
}
