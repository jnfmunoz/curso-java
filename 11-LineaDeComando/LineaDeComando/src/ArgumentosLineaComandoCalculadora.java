public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {

        if(args.length != 3 ){
            System.out.println("Por favor ingresar una operación" +
                "(suma, resta, multi o div) y dos enteros");
            System.exit(-1);
        }

        String operation = args[0];

        int a = 0;
        int b = 0;
        double resultado = 0.00;

        try{
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);

        } catch(NumberFormatException e){
            System.err.println("a y b deben ser valores enteros, vuelva a intentar");
            System.exit(-1);
        }

        switch(operation){
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multi":
                resultado = a * b;
                break;
            case "div":
                if(b == 0){
                    System.out.println("No se puede dividir por cero!");
                    System.exit(-1);
                }
                resultado = (double) a / b;
                break;
            default:
                resultado = a + b;
        }

        System.out.println("Resultado de la operación '" + operation + "' es: " + resultado);
    }
}
