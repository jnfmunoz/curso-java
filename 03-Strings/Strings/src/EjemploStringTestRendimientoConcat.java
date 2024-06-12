public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            // = c.concat(a).concat(b).concat("\n"); // 500 => 3ms, 1000 => 7ms, 10000 => 171ms, 100000 => 9289ms
            // c += a + b + "\n"; // 500 => 21ms, 1000 => 33ms, 10000 => 92ms, 100000 => 3163ms
            sb.append(a).append(b).append("\n");  // 500 => 00ms, 1000 => 00ms, 10000 => 04ms, 100000 => 21ms
        };

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
