public class PrimitivosChar {
    public static void main(String[] args) {
        // char character = 'A';
        char character = '\u0040'; //var character = '\u0040';
        char decimal = 64; //var decimal = 64;

        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = character: " + (decimal == character));

        char symbol = '@';
        System.out.println("symbol = " + symbol);
        System.out.println("symbol = character: " + (symbol == character));

        System.out.println("Char corresponde en byte = " + Character.BYTES);
        System.out.println("Char corresponde en bites = " + Character.SIZE);
        System.out.println("Valor máximo de un Char = " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de un Char = " + Character.MIN_VALUE);

        // Char y caracteres especiales
        char space = ' ';
        char backspace = '\b';
        char tab = '\t';
        char newLine = '\n';
        char carriageReturn = '\r';

        System.out.println("space corresponde en byte = " + space + Character.BYTES);
        System.out.println("backspace corresponde en byte =  " + backspace + Character.BYTES);
        System.out.println("tab corresponde en byte =  " + tab + Character.BYTES);
        System.out.println("newLine corresponde en byte = " + newLine + Character.BYTES);
        System.out.println("carriageReturn corresponde en byte = " + carriageReturn + Character.BYTES);
        // System.out.println("Line separator = " + System.getProperty("line.separator") + Character.BYTES);
        System.out.println("Line separator = " + System.lineSeparator() + Character.BYTES);
    }
}
