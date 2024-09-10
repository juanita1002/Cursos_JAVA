// Propiedades de sistema
import java.util.Properties;


public class PropiedadesDeSistema {
    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator = " + lineSeparator + "Una linea nueva");

        String javaHome = System.getProperty("java.home");
        System.out.println("javaHome = " + javaHome);

        String os = System.getProperty("os.name");
        System.out.println("os = " + os);

        String fileSeparator = System.getProperty("file.separator");
        System.out.println("fileSeparator = " + fileSeparator);

        String classPath = System.getProperty("java.class.path");
        System.out.println("classPath = " + classPath);

        String path = System.getProperty("java.library.path");
        System.out.println("path = " + path);

        String temp = System.getProperty("java.io.tmpdir");
        System.out.println("temp = " + temp);

        String user = System.getProperty("user.name");
        System.out.println("user = " + user);

        String timezone = System.getProperty("user.timezone");
        System.out.println("timezone = " + timezone);

        String country = System.getProperty("user.country");
        System.out.println("country = " + country);

        String language = System.getProperty("user.language");
        System.out.println("language = " + language);

        String encoding = System.getProperty("file.encoding");
        System.out.println("encoding = " + encoding);

        String version = System.getProperty("java.version");
        System.out.println("version = " + version);

        String vendor = System.getProperty("java.vendor");
        System.out.println("vendor = " + vendor);

        String vendorUrl = System.getProperty("java.vendor.url");
        System.out.println("vendorUrl = " + vendorUrl);

        String vm = System.getProperty("java.vm.name");
        System.out.println("vm = " + vm);

        String vmVersion = System.getProperty("java.vm.version");
        System.out.println("vmVersion = " + vmVersion);

        String vmVendor = System.getProperty("java.vm.vendor");
        System.out.println("vmVendor = " + vmVendor);

        String vmInfo = System.getProperty("java.vm.info");
        System.out.println("vmInfo = " + vmInfo);

        Properties sm = System.getProperties();
        sm.list(System.out);

    }
}
