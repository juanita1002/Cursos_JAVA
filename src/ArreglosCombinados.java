import java.util.Arrays;

public class ArreglosCombinados {
    public static void main(String[] args) {

        int[] primerArreglo = {1, 2, 3, 4, 5};
        int[] segundoArreglo = {6, 7, 8, 9, 10};
        int[] arregloCombinado = new int[primerArreglo.length + segundoArreglo.length]; // 10 la longitud de los dos arreglos

        int aux = 0;

        for (int i = 0; i < primerArreglo.length; i++) {
            arregloCombinado[aux++] = primerArreglo[i]; //  1, 2, 3, 4, 5 [0, 2, 4, 6, 8]
           // arregloCombinado[aux++] = segundoArreglo[i]; //  6, 7, 8, 9, 10 [1, 3, 5, 7, 9]
        }
        for (int j = 0; j < segundoArreglo.length; j++) {
            arregloCombinado[aux++] = segundoArreglo[j];
        }

        for (int i = 0; i < arregloCombinado.length; i++) {
         //   Arrays.sort(arregloCombinado); //  Este método organiza los elementos del arreglo arregloCombinado
            System.out.println("arregloCombinado posicion " + i + " = " + arregloCombinado[i]);
        }



    }
}
