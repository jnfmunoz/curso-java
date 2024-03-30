import javax.swing.*;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        // Scanner scanner = new Scanner();


        String numberStr = JOptionPane.showInputDialog(null, "Ingrese un número entero: ");
        int decimalNumber = 0;
        try{
            decimalNumber = Integer.parseInt(numberStr);
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("decimalNumber = " + decimalNumber);

        String binaryResult = "numero binario de " + decimalNumber + " = " + Integer.toBinaryString(decimalNumber);
        System.out.println(binaryResult);

        /* int binaryNumber = 0b111110100; //anteponer 0b para indicar que corresponde a un sistema binario
        System.out.println("binaryNumber = " + binaryNumber); */

        String octalResult = "numero octal de " + decimalNumber + " = " + Integer.toOctalString(decimalNumber);
        System.out.println(octalResult);
        /* int octalNumber = 0764;
        System.out.println("octalNumber = " + octalNumber); */

        String hexResult = "numero hexadecimal de " + decimalNumber + " = " + Integer.toHexString(decimalNumber);
        System.out.println(hexResult);
        /* int hexNumber = 0x1f4;
        System.out.println("hexNumber = " + hexNumber); */

        String mensaje = binaryResult;
        mensaje += "\n" + octalResult;
        mensaje += "\n" + hexResult;

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
