import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArreglosIntro {
    public static void main(String[] args) {
        //Enteros array

        System.out.println(" =============== Enteros array ============== " );

        int[] enteros = new int[5];
        enteros[0] = 1;
        enteros[1] = 2;
        enteros[2] = 3;
        enteros[3] = 4;
        enteros[4] = 5;
         for (int i = 0; i< enteros.length; i++){
             System.out.println( "Entero posicion " + i + " = " + enteros[i]);
         }

         //String array
        System.out.println(" =============== String array ============== ");

        String[] cadenas = new String[5];
        cadenas[0] = "Amarillo";
        cadenas[1] = "Azul";
        cadenas[2] = "Rojo";
        cadenas[3] = "Verde";
        cadenas[4] = "Negro";

        Arrays.sort(cadenas); //  Este método organiza los elementos del arreglo cadenas
        Collections.reverse(Arrays.asList(cadenas));
        // Arrays.asList(cadenas): Convierte el arreglo cadenas en una lista. Esto es necesario porque el método
        // Collections.reverse(...): Invierte el orden de los elementos en la lista.

        for (int i= 0; i<cadenas.length;i++){
            String cadena = cadenas[i];
            System.out.println("Cadena posicion " + i + " = " + cadena);

        }


        System.out.println(" =============== Array  for ============== ");

        int [] entero2 = {1,2,3};
        for (int i= 0; i<entero2.length;i++){
            int enterofin = entero2[i];
            System.out.println("Entero posicion " + i + " = " + enterofin);
        }

        //Con for each
        System.out.println(" =============== Array con for each ============== " );
        for(int enterofin2:entero2){

            System.out.println("enterofin2 = " + enterofin2);
        }

        //con While

        System.out.println(" =============== Array con While ============== ");
         int i=0;
        while (i<entero2.length){
            System.out.println("Entero posicion " + i + " = " + entero2[i]);
            i++;
        }


        System.out.println(" =============== Inversa ============== ");
        for (int j = entero2.length-1; j>=0; j--){
            System.out.println("Entero posicion " + j + " = " + entero2[j]);
        }

        System.out.println(" =============== Inversa 2 ============== ");

        for (int k = 0; k < entero2.length;  k++){
            System.out.println("Entero posicion " + (entero2.length-1-k) + " = " + entero2[entero2.length-1-k]);
        }




    }
}
