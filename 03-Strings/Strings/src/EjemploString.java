public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java"; //Literal
        String curso2 = new String("programación Java"); //Implícitasql
        String curso3 = "Programación Java";
        
        boolean esIgual = curso == curso2; //referencia
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equals(curso2); //valor
        System.out.println("curso.equals(curso2) = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
    }
}
