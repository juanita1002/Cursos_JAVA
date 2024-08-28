public class StrExtencionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.jpeg";
        System.out.println("archivo = " + archivo);
        System.out.println("archivo.length() = " + archivo.length());

        int i = archivo.lastIndexOf(".");// se busca la ultima ocurrencia del punto porque puede haber mas de uno
        if (i == -1) {
            System.out.println("No tiene extensión");
        } else {
            System.out.println("La extensión del archivo es: " + archivo.substring(i)); //para incluir el punto
            System.out.println("archivo.substring(i+1)  = " + archivo.substring(i+1) ); //para no incluir el punto
        }
    }
}
