public class PrimitivosChar {
    public static void main(String[] args) {
        // char character = 'A';
        char character = '\u0040'; //var character = '\u0040';
        char decimal = 64; //var decimal = 64;
        char symbol = '@';
        
        var character2 = '\u0040';
        
        System.out.println("character = " + character);
        System.out.println("decimal = " + decimal);
        System.out.println("symbol = " + symbol);
        System.out.println("character = symbol " + (character == symbol));

        System.out.println("Char corresponde en byte: " + Character.BYTES);
        System.out.println("Char corresponde en bites: " + Character.SIZE);
        System.out.println("Valor máximo de un Char: " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de un Char: " + Character.MIN_VALUE);
    }
}
