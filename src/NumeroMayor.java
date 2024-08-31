import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escribe número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        int mayor = 0;
        int menor = 999999999;

        for (int i = 0; i < numeros.length; i++) {
            mayor = mayor > numeros[i] ? mayor : numeros[i];
            System.out.println("numero "+ (i+1) + ": " + numeros[i]);
            menor = menor < numeros[i] ? menor : numeros[i];

        }
        System.out.println("\nNumero mayor = " + mayor);
        System.out.println("Numero memnor = " + menor);
    }
}
