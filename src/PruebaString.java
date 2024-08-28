public class PruebaString {
    public static void main(String[] args) {
        String caso = "Hola Mundo" ;
        String caso1 = "Hola Mundo" ;
        String caso2 = new String("Hola Mundo");

        boolean esIgual = caso == caso1; // true porque apuntan a la misma referencia
        System.out.println("esIgual = " + esIgual);
        esIgual = caso == caso2; // false porque apuntan a referencias diferentes
        System.out.println("esIgual = " + esIgual);
        esIgual = caso.equals(caso2); // true porque el contenido es el mismo
        System.out.println("esIgual = " + esIgual);
    }
}
