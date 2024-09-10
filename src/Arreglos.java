import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
       // Arreglos como se usan en Java
        // int [] numeros = {1, 2, 3, 4, 5}; // Arreglo de 5 elementos // numeros porque es plural
        // int [] numeros = new int[5]; // Arreglo de 5 elementos
        // numeros[0] = 1;
        // numeros[1] = 2;
        // for (int i = 0; i < numeros.length; i++) {
        //     System.out.println("numeros[" + i + "] = " + numeros[i]);
        // }

        // Producto[] produc = new Producto[3];
        // produc[0] = new Producto("Producto 1", 200.0);
        // produc[1] = new Producto("Producto 2", 300.0);
        // produc[2] = new Producto("Producto 3", 400.0);


        String[] nombres =  {"Juan", "Pedro", "Luis", "Carlos", "Ana", "Maria", "Jose", "Luisa", "Fernando", "Sofia"};
        boolean encontro = false;
        String nombreEncontrado = " ";

        try {
            for (int i = 0; i <= nombres.length; i++) {
                System.out.println(i + ". " + nombres[i]);
            }
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        Scanner sc= new Scanner(System.in);
        System.out.println("Escribe un nombre: ");
        String buscar = sc.nextLine();
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontro = true;
                nombreEncontrado = nombres[i] + " esta en la posicion " + i;
                break;
            }
        }
            if (encontro == true) {
                System.out.println("El nombre " + nombreEncontrado);
            }else {
                System.out.println("El nombre "+ buscar+ " no se encuentra en la lista");
            }

    }
}
