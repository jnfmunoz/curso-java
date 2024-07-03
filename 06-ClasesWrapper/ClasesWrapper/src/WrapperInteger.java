public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitive = 32768;
        Integer intObject = Integer.valueOf(intPrimitive);
        Integer intObject2 = intPrimitive;

        System.out.println("intObject = " + intObject);
        System.out.println("intObject2 = " + intObject2);

        int num = intObject;
        System.out.println("num = " + num);
        int num2 = intObject.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObject = intObject.shortValue(); // pérdida de información por tamaño de variable
        System.out.println("shortObject = " + shortObject);

        Byte byteObject = intObject.byteValue(); // pérdida de información por tamaño de variable
        System.out.println("byteObject = " + byteObject);

        Long longObject = intObject.longValue();
        System.out.println("longObject = " + longObject);

    }
}
