public class EjemploArreglos {
    public static void main(String[] args) {

        int[] numbers = new int[4];

        numbers[0] = 1;
        numbers[1] = Integer.valueOf("2");
        numbers[2] = (int)35L;
        numbers[3] = -1;
        // numbers[4] = 5;

        int i = numbers[0];
        int j = numbers[1];
        int k = numbers[2];
        int l = numbers[numbers.length - 1];
        // int m = numbers[4];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }

}
