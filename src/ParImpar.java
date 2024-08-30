import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        try {
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par");
            } else {
                System.out.println("El número " + numero + " es impar");

            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa un número entero");
            main(args);
        }

    }
}
