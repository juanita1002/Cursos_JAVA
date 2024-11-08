public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        int[] enteros = {45, 30, 44, 12, 2};
//        System.out.println(" =============== Enteros array ============== ");
//        for (int i = 0; i < enteros.length; i++) {
//            System.out.println("Entero posicion " + i + " = " + enteros[i]);
//        }
        // Ordenamiento burbuja
        for (int i = 0; i < enteros.length - 1; i++) { // recorre el arreglo
            for (int j = 0; j < enteros.length - 1 -i ; j++) { // recorre el arreglo y compara
                if (enteros[j] < enteros[j + 1]) { // si el elemento actual es mayor al siguiente
                    int temp = enteros[j];            // intercambia los elementos
                    enteros[j] = enteros[j + 1];     // intercambia los elementos
                    enteros[j + 1] = temp;         // intercambia los elementos
                }
            }
        }
        System.out.println(" =============== Enteros array ordenados ============== ");
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Entero posicion " + i + " = " + enteros[i]);
        }
    }
}
