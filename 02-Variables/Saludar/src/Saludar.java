public class Saludar {
    public static void main(String[] args) {

        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());

        int numero = 10;

        boolean valor = true;
        int numero2 = 5;
        if(valor){
            System.out.println("numero = " + numero);
            numero2 = 10;
        }
        System.out.println("numero = " + numero2);

        var numero3 = "15";

        //Reglas para definir una variable
        String nombre;

        nombre = "Juan";
        if(numero>10){
            nombre="Andrés";
        }
        System.out.println("nombre = " + nombre);

        
    }
}
