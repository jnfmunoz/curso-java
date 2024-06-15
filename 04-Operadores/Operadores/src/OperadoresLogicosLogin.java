import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "admin";
        String password = "admin";

        String username2 = "admin2";
        String password2 = "admin2";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Username: ");
        String u = scanner.next();

        System.out.println("Ingrese password: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        if( ((username.equals(u) && password.equals(p)) || (username2.equals(u)) && password2.equals(p))){
            esAutenticado = true;
        }

        if(esAutenticado == true){
            System.out.println("Bienvenido " + u + "!");
        }
        else {
            System.out.println("Usuario inválido");
        }

    }
}
