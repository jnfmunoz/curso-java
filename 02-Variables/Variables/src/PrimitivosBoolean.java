public class PrimitivosBoolean {
    public static void main(String[] args) {
        boolean logicalData = true; // Boolean.True
        System.out.println("logicalData = " + logicalData);

        double d = 98765.43e-3; // 98.76543
        System.out.println("d = " + d);
        
        float f = 1.2345e2f; // 123.45
        System.out.println("f = " + f);
        
        logicalData = d < f;
        System.out.println("logicalData = " + logicalData);

        boolean isEqual = (3-2 == 1);
        System.out.println("isEqual = " + isEqual);
        
    }
}
