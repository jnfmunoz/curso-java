import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /* String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "admin";
        passwords[0] = "admin";

        usernames[1] = "admin2";
        passwords[1] = "admin2";

        usernames[2] = "admin3";
        passwords[2] = "admin3"; */

        String[] usernames = {"admin", "admin2", "admin3"};
        String[] passwords = {"admin", "admin2", "admin3"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Username: ");
        String u = scanner.next();

        System.out.println("Ingrese password: ");
        String p = scanner.next();

        boolean esAutenticado = false;

        for(int i = 0; i < usernames.length; i++){
            if( ((usernames[i].equals(u) && passwords[i].equals(p))) ){
                esAutenticado = true;
                break;
            }
        }

        if(esAutenticado){
            System.out.println("Bienvenido " + u + "!");
        }
        else {
            System.out.println("Username o contraseña incorrecta!");
            System.out.println("Error al iniciar sesión");
        }

    }
}