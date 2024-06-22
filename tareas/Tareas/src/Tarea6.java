import javax.swing.JOptionPane;

public class Tarea6 {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog(null, "Ingrese primer nombre: ");
        String nombre2 = JOptionPane.showInputDialog(null, "Ingrese segundo nombre: ");
        String nombre3 = JOptionPane.showInputDialog(null, "Ingrese tercer nombre: ");

        String max = (nombre1.split(" ")[0].length() < nombre2.split(" ")[0].length()) ? nombre2 : nombre1;
        max = (nombre3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: nombre3;

        System.out.println("La persona con el nombre mas largo es " + max);
    }

}
