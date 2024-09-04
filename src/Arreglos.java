import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
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
