import java.util.Scanner;

public class ParImparArreglo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Clase Scanner para leer datos del usuario
        int[] numeros = new int[5];
        int[] par = new int[5];
        int[] impar = new int[5];
        int coutPar = 0;
        int coutImpar = 0;

        System.out.println("Ingresa 5 un números: ");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }


        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 2 == 0){ // si el residuo de la división es 0 es par
                coutPar++;
            }else {
                coutImpar++; // si el residuo de la división es diferente de 0 es impar
            }
        }

        int j = 0;
        int k = 0;


        for (int i = 0; i < numeros.length; i++) {
           if(numeros[i] % 2 == 0){
                par[j++] = numeros[i];
           }else {
               impar[k++] = numeros[i];
           }
        }
        System.out.println("Pares");

        for (int i = 0; i < coutPar; i++) {
            System.out.print(par[i] + " ");
        }

        System.out.println(" \nImpares");
        for (int i = 0; i < coutImpar; i++) {
            System.out.print(impar[i] + " ");
        }
    }
}
