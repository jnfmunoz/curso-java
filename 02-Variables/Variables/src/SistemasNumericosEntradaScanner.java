import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");

        int decimalNumber = 0;
        try{
            decimalNumber = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("decimalNumber = " + decimalNumber);

        String binaryResult = "numero binario de " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);

        String octalResult = "numero octal de " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);

        String hexResult = "numero hexadecimal de " + decimalNumber + " = " + Integer.toHexString(decimalNumber);

        String mensaje = binaryResult;
        mensaje += "\n" + octalResult;
        mensaje += "\n" + hexResult;

        System.out.println(mensaje);
    }
}
