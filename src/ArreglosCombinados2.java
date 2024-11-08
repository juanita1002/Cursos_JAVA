public class ArreglosCombinados2 {
    public static void main(String[] args) {
        int[] primerArreglo = {1, 2, 3, 4, 5};
        int[] segundoArreglo = {6, 7, 8, 9, 10};
        int[] arregloCombinado = new int[primerArreglo.length + segundoArreglo.length]; // 10 la longitud de los dos arreglos

        int aux = 0;

        for (int i = 0; i < primerArreglo.length; i+=2) {
            for (int j = 0; j < 2; j+=2) {
                arregloCombinado[aux++] = primerArreglo[i+j]; //  1, 2, 3, 4, 5 [0, 2, 4, 6, 8]
            }

            for (int j = 0; j < 2; j+=2) {
                arregloCombinado[aux++] = segundoArreglo[i]; //  6, 7, 8, 9, 10 [1, 3, 5, 7, 9]
            }



        }
        for (int i = 0; i < arregloCombinado.length; i++) {
            System.out.println("arregloCombinado posicion " + i + " = " + arregloCombinado[i]);
        }

       

    }
}