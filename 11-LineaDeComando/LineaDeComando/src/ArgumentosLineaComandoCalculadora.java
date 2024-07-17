public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {

        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00;

        switch(operacion){
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
                resultado = (double)a/b;
                break;
            default:
                resultado = a + b;
        }

    }
}
