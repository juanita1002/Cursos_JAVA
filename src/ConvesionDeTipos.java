public class ConvesionDeTipos {
    public static void main(String[] args) {
        //Combertirt tipos de datos a String en Java

        System.out.println( "\n" + "Comvertir  String otro tipo de dato en Java " + "\n");


        //String numero string
        String numeroStr = "55";

        // Convertir de String a int
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        // Convertir de String a long
        long numeroLong = Long.parseLong(numeroStr);
        System.out.println("numeroLong = " + numeroLong);

        // Convertir de String a double
        double realDouble = Double.parseDouble(numeroStr);
        System.out.println("realDouble = " + realDouble);

        // Convertir de string a char
        char caracter = numeroStr.charAt(0);
        System.out.println("caracter = " + caracter);

        // Convertir de String a boolean
        String booleanStr = "False";
         boolean booleano = Boolean.parseBoolean(booleanStr);
        System.out.println("booleano = " + booleano);


        //Combertirt tipos de datos a String en Java

        System.out.println("\n" + "Comvertir tipos de datos a String en Java " + "\n");

         int nuevoNumeroInt = 100;
         long   nuevoNumeroLong = 2000000000;
         double  nuevoNumeroDouble = 1.23456;
         boolean nuevoBoleano = true;
         char nuevoCaracter = 'a';
         float nuevoReal = 1.234F;


         // Convertir de int a String
        String otroNumeroStr = Integer.toString(nuevoNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        // Convertir de long a String
        String OtroNumeroLong = Long.toString(nuevoNumeroLong);
        System.out.println("otroNumeroStr2 = " + OtroNumeroLong);

        // Convertir de double a String
        String otroRealStr = Double.toString(nuevoNumeroDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        // Convertir de float a String
        String otroRealStr2 = Float.toString(nuevoReal);
        System.out.println("otroRealStr2 = " + otroRealStr2);


        // Convertir de boolean a String
        String otroBooleanStr = Boolean.toString(nuevoBoleano);
        System.out.println("otroBooleanStr = " + otroBooleanStr);

        // Convertir de char a String
        String otroCaracterStr = Character.toString(nuevoCaracter);
        System.out.println("otroCaracterStr = " + otroCaracterStr);




    }
}
