import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombreFactura;
        double precio1;
        double precio2;
        double monto_total_bruto = 0;
        double impuesto = 0;
        double monto_total_iva = 0;

        System.out.println("Ingrese un nombre para la factura: ");
        nombreFactura = scanner.nextLine();

        System.out.println("Ingrese el monto del primer producto");
        precio1 = scanner.nextDouble();

        System.out.println("Ingrese el monto del segundo producto");
        precio2 = scanner.nextDouble();

        monto_total_bruto = precio1 + precio2;
        impuesto = (monto_total_bruto*.19);
        monto_total_iva = impuesto+monto_total_bruto;

        System.out.println("La factura " + nombreFactura + " tiene un total bruto de $" + monto_total_bruto
                            + ", con un impuesto de $" + impuesto + " y un monto total de $" + monto_total_iva);

    }
}
