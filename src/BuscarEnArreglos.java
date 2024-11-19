import java.util.Scanner;

public class BuscarEnArreglos {

    public static void main(String[] args) {
        int[] numeros = new int[10]; // arreglo de 10 elementos

        Scanner sc = new Scanner(System.in); // objeto para leer datos desde consola


        System.out.println("Ingresar 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();   // leer un número desde consola
        }

        int numBuscar = 0;
        System.out.println("Ingresar número a buscar:");
        numBuscar = sc.nextInt();  // leer un número desde consola

        int i = 0;
      while(i < numeros.length && numBuscar != numeros[i]){ // mientras no se haya llegado al final del arreglo y el número no se haya encontrado
            i++; // incrementar el contador
      }
        if(i == numeros.length){ // si se llegó al final del arreglo
            System.out.println("No se encontró el número"); // imprimir mensaje que no se encontró el número
        }else{
            System.out.println("Se encontró el número en la posición " + i); // si no se llegó al final del arreglo, imprimir la posición donde se encontró el número
        }

    }
}
