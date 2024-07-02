import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Tarea10JOptionPane {
    public static void main(String[] args) {

        int optionIndice = 0;
        do {
            Map<String, Integer> opciones = new HashMap();
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();

            Object option = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (option == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                optionIndice = opciones.get(option.toString());

                switch (optionIndice){
                    case 1:
                        JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente!");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente!");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Usuario agregado correctamente!");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Usuario encontrado!");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Hasta pronto!");
                }
            }
        } while (optionIndice != 5);

    }
}
