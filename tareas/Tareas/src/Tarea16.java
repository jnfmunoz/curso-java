public class Tarea16 {
    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 3, 4, 5, 5, 5, 6, 7 };
        int ocurrencias = 0, elemento = 0;

        for (int i = 0; i < a.length; i++) {
            int currentElemento = a[i];
            int currentOcurrencias = 0;

            for (int j = 0; j < a.length; j++){
                if (a[j] == currentElemento){
                    currentOcurrencias++;
                }
            }

            if (currentOcurrencias > ocurrencias){
                ocurrencias = currentOcurrencias;
                elemento = currentElemento;
            }
        }

        System.out.println("El elemento que más se repite es: " + elemento);
        System.out.println("La cantidad de veces que se repite es: " + ocurrencias);
    }
}
