import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        int count_nombres = nombres.length;

        for(int i = 0; i < count_nombres; i++){
            if(nombres[i].equalsIgnoreCase("andres") ||
                nombres[i].toLowerCase().contains("PEPA".toLowerCase())) {
                continue;
            }
            System.out.println(i + ".-" + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre \"Pepe\" o \"Maria\" ");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for(int i = 0; i < count_nombres; i++) {
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado  = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema!");
        }
    }
}
