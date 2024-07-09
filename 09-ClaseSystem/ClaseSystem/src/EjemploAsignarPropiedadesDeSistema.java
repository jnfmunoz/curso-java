import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("src/config.properties");
            // FileInputStream file = new FileInputStream("src/config2.properties");


            Properties p = new Properties(System.getProperties());
            p.load(file);
            p.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");
            System.setProperties(p);

            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.clearProperty("config.puerto.servidor"));
            System.out.println(System.clearProperty("config.autor.nombre"));
            System.out.println(System.clearProperty("config.autor.email"));

        } catch (Exception e) {
            // System.out.println("No existe el archivo! " + e);
            System.err.println("No existe el archivo! " + e);
            System.exit(1);
        }
    }
}
