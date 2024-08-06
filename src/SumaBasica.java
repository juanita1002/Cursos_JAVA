import java.util.Scanner;

public class SumaBasica {
    public static void main(String[] args) {

        // solicitar dos números y sumarlos
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = scanner.nextInt();

        int suma = a + b;
        System.out.println("La suma de " + a + " + " + b + " es: " + suma);
    }
}
