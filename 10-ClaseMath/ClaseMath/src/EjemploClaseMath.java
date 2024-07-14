public class EjemploClaseMath {
    public static void main(String[] args) {
        
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.5, 1.2);
        System.out.println("Valor max entre 3.5 y 1.2 = " + max);

        double min = Math.min(3.5, 1.2);
        System.out.println("Valor min entre 3.5 y 1.2 = " + min);

        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        long entero = Math.round(3.5);
        System.out.println("entero = " + entero);

        entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);

        double exp = Math.exp(2);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);
        
        double potencia = Math.pow(10, 3); // 10e3
        System.out.println("potencia = " + potencia);

        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("Convertir de radianes a grados = " + grados);

        double radianes = Math.toRadians(90.00);
        System.out.println("Convertir de grados a radianes = " + radianes);

        System.out.println("Math.sin(radianes) = " + Math.sin(radianes));
        System.out.println("Math.cos(radianes) = " + Math.cos(radianes));
        
        radianes = Math.toRadians(180);
        System.out.println("Math.cos(180) = " + Math.cos(radianes));

        radianes = Math.toRadians(0.00);
        System.out.println("Math.cos(0.00) = " + Math.cos(radianes));

        

    }
}
