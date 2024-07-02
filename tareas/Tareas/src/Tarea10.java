import java.util.Scanner;

public class Tarea10 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int option;
        boolean menu = true;

        do{
            System.out.println("Ingrese una opción (1 - 5): ");
            System.out.println("1. Actualizar\n2. Eliminar \n3. Agregar \n4. Listar \n5. Salir");

            option = s.nextInt();

            switch (option){
                case 1:
                    System.out.println("Usuario actualizado correctamente!");
                    break;
                case 2:
                    System.out.println("Usuario eliminado correctamente!");
                    break;
                case 3:
                    System.out.println("Usuario agregado correctamente!");
                    break;
                case 4:
                    System.out.println("Usuario encontrado!");
                    break;
                case 5:
                    System.out.println("Hasta pronto !");
                    menu = false;
                default:
                    System.out.println("Opción inválida!");
                    break;
            }

        }while(menu);

        s.close();
    }
}
