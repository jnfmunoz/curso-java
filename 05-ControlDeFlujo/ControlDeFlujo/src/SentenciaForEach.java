public class SentenciaForEach {
    public static void main(String[] args) {

        int[]  numbers = {1,3,5,7,9,11,13,15};
        for(int num:numbers){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};
        for(String nombre:nombres){
            System.out.println("nombre = " + nombre);
        }
        
    }
}
