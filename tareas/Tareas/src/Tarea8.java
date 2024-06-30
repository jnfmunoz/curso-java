import java.util.Scanner;

public class Tarea8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double[] notas = new double[20];

        int contar_notas_mayor_5 = 0;
        int contar_notas_inferior_4 = 0;
        int contar_notas_1 = 0;
        double suma_notas_mayor_5 = 0;
        double suma_notas_inferior_4 = 0;
        double suma_promedio_final = 0;
        double promedio_notas_mayor_5 = 0;
        double promedio_notas_inferior_4 = 0;
        double promedio_final = 0;

        for(int i=0; i < notas.length ;i++){
            int j = i+1;
            System.out.println("Ingrese nota n°" + j + ":");
            notas[i]= s.nextDouble();

            if(notas[i]==0) {
                System.out.println("Error, la nota debe ser en una escala entre 1 a 7!!");
                break;
            }

            if(notas[i] < 1 || notas[i] > 7){
                System.out.println("Error, la nota debe ser en una escala entre 1 a 7!!");
                i--;
            }
        }

        for(double nota:notas){
            if(nota>5){
                suma_notas_mayor_5+=nota;
                contar_notas_mayor_5+=1;
            } else if (nota<4) {
                suma_notas_inferior_4+=nota;
                contar_notas_inferior_4 += 1;
            }

            if(nota == 1){
                contar_notas_1+=1;
            }

            suma_promedio_final+=nota;

            promedio_final = suma_promedio_final/notas.length;
            promedio_notas_mayor_5 = suma_notas_mayor_5 / contar_notas_mayor_5;
            promedio_notas_inferior_4 = suma_notas_inferior_4 / contar_notas_inferior_4;
        }

        System.out.println("Promedio de notas mayor a 5: " + promedio_notas_mayor_5);
        System.out.println("Promedio de notas menor a 4: " + promedio_notas_inferior_4);
        System.out.println("Cantidad de notas 1: " + contar_notas_1);
        System.out.println("Promedio Final: " + promedio_final);


    }
}