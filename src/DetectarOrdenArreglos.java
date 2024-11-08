import java.util.Scanner;

public class DetectarOrdenArreglos {

    public static void main(String[] args) {

        int[] arreglo = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println(" Ingrese 5 numeros: ");

        for (int i = 0; i < arreglo.length; i++) {

            arreglo[i] = sc.nextInt();

        }
        for (int i = 0; i < arreglo.length; i++){
        System.out.println("arreglo = " + arreglo[i]);
        }

         boolean ascendente = false;
            boolean descendente = false;
        for (int i = 0; i < arreglo.length - 1 ; i++) {
           if(arreglo[i] < arreglo[i+1]) {
               ascendente = true;

           }else if(arreglo[i] > arreglo[i+1]) {
               descendente = true;
           }

        }


           if(ascendente && descendente == true){
               System.out.println("El arreglo no esta desordenado");
           } else if(ascendente == true && descendente == false){
                System.out.println("El arreglo esta ordenado de forma ascendente");
              }else if(ascendente == false && descendente == true){
                System.out.println("El arreglo esta ordenado de forma descendente");
              }else if(ascendente == false && descendente == false){
                System.out.println("El arreglo  todos los elementos son iguales");
              }


    }
}
