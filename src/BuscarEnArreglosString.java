import java.util.Scanner;

public class BuscarEnArreglosString {

    public static void main(String[] args) {
        String[] nombres = new String[5];

        Scanner sc = new Scanner(System.in);


        System.out.println("Ingresar 5 nombres:"); // Ingresar 5 nombres
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = sc.nextLine();
        }

        String numBuscar;
        System.out.println("Ingresar nombre a buscar:");
        numBuscar = sc.nextLine();  // Ingresar nombre a buscar

        int i = 0;
      while(i < nombres.length && !(numBuscar.equalsIgnoreCase(nombres[i]))){ // Buscar el nombre en el arreglo con el método equalsIgnoreCase para ignorar mayúsculas y minúsculas y que sea igual
            i++; // Incrementar el contador
      }
        if(i == nombres.length){ // Si el contador es igual a la longitud del arreglo
            System.out.println("No se encontró el nombre en el arreglo."); // No se encontró el nombre en el arreglo
        }else if(nombres[i].toUpperCase().equals(numBuscar.toUpperCase())){ // Si el nombre en la posición i es igual al nombre a buscar en mayúsculas
            System.out.println("Se encontró el nombre en la posición " + i);// Se encontró el nombre en la posición i
        }

    }
}
