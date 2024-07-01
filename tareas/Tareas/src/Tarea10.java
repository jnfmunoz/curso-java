import java.util.Scanner;

public class Tarea10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int option;
        boolean menu = true;

        System.out.println("Ingrese una opción (1 - 5): ");
        System.out.println("1. Actualizar\n2. Eliminar \n3. Agregar \n4. Listar \n5. Salir");

        option = s.nextInt();

        do{
            if (option == 5){
                menu = false;
            }
            

        }while(menu);




        /* opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5); */




    }
}
