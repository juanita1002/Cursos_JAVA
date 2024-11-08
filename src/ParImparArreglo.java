import java.util.Scanner;

public class ParImparArreglo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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
            if(numeros[i] % 2 == 0){
                coutPar++;
            }else {
                coutImpar++;
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

        for (int i = 0; i < coutPar; i++) {
            System.out.println("Par= " + par[i]);
        }

        for (int i = 0; i < coutImpar; i++) {
            System.out.println("Impar= " + impar[i]);
        }
    }
}
