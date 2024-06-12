public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Juan";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Juan\") = " + nombre.equals("Juan"));
        System.out.println("nombre.equals(\"juan\") = " + nombre.equals("juan"));
        System.out.println("nombre.equalsIgnoreCase(\"juan\") = " + nombre.equalsIgnoreCase("juan"));
        System.out.println("nombre.compareTo(\"Juan\") = " + nombre.compareTo("Juan"));
        System.out.println("nombre.compareTo(\"Francisco\") = " + nombre.compareTo("Francisco"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1,3) = " + nombre.substring(1,3));
        System.out.println("nombre.substring(2,4) = " + nombre.substring(2,4));
        System.out.println("nombre.substring(4) = " + nombre.substring(4));
        System.out.println("nombre.length()-1 = " + nombre.substring(nombre.length()-1));
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\", \".\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.indexOf(\"lenguas\") = " + trabalenguas.indexOf("lenguas"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("as"));
        System.out.println("  trabalenguas ");
        System.out.println("  trabalenguas ".trim());

    }
}
