import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

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
        
        if(menor <= 10) {
            System.out.println("Numero menor = " + menor);
            System.out.println("El numero " + menor + " es menor o igual a 10!!");
        }else {
            System.out.println("Numero menor = " + menor + " es mayor a 10!!");
        }
        }
}
