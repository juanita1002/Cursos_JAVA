import java.io.FileInputStream;
import java.util.Properties;

public class AsignarPropiedadesEnElSistema {
    public static void main(String[] args) {

        try {
            FileInputStream fl = new FileInputStream("src/config.properties"); // Se debe de especificar la ruta del archivo
            Properties prop = new Properties(System.getProperties()); // Se le pasa las propiedades del sistema
            prop.load(fl); // Se cargan las propiedades del archivo
            prop.setProperty("mi.propiedad", "Mi valor"); // Se asigna una propiedad
            System.out.println("prop = " + prop); // Se imprime las propiedades

            System.setProperties(prop); // Se asignan las propiedades al sistema
            System.getProperties().list(System.out); // Se imprimen las propiedades del sistema


            System.out.println("getProperty(....) = " + prop.getProperty("mi.propiedad")); // Se obtiene una propiedad
            System.out.println("getProperty(....) = " + System.getProperty("config.correo.autor")); // Se obtiene una propiedad
        }catch (Exception e) {
            System.out.println("e = " + e); // Se imprime la excepcion
            System.out.println("No se encontro el archivo"); // Se imprime un mensaje
        }


    }

}
