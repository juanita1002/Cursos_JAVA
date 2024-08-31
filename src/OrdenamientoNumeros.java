import java.util.Scanner;

public class OrdenamientoNumeros {

    public static void main(String[] args) {

        //Numero mayor
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[4];
        int mayor = 0;

        for (int i = 0; i < numero.length; i++) {

            System.out.println("Ingrese número " + (i + 1));
            numero[i] = sc.nextInt();
            mayor = mayor > numero[i] ? mayor : numero[i];
        }
        System.out.println("El número mayor es: " + mayor);

        //Ordenamiento de mayor a menor
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero.length - 1; j++) {
                if (numero[j] < numero[j + 1]) {
                    int aux = numero[j];
                    numero[j] = numero[j + 1];
                    numero[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }
    }
}
