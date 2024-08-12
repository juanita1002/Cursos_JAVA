public class SistemasNumericosScaner {

    public static void main(String[] args) {

        // Crear una instancia de Scanner para leer la entrada del usuario desde la consola
                    java.util.Scanner scanner = new java.util.Scanner(System.in);
                    int numeroEntero = 0;

                    try {
                        System.out.print("Introduce un número entero: ");
                        numeroEntero = scanner.nextInt(); // Leer un número entero
                    } catch (Exception e) { // Capturar cualquier excepción
                        System.out.println("Error: Por favor introduce un número entero");
                       main(args); // Volver a llamar al método main
                       System.exit(0); // Salir del programa

                    }
                    System.out.println("numeroEntero = " + numeroEntero); // Imprimir el número entero
                    System.out.println("numeroBinario = " + Integer.toBinaryString(numeroEntero)); // Imprimir el número binario
                    System.out.println("numeroOctal = " + Integer.toOctalString(numeroEntero)); // Imprimir el número octal
                    System.out.println("numeroHexadecimal = " + Integer.toHexString(numeroEntero)); // Imprimir el número hexadecimal
                }
    }

