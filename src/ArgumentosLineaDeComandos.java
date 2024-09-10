
public class ArgumentosLineaDeComandos {
    public static void main(String[] args) {
        // Se ejecuta el programa con argumentos desde la terminal de la siguiente manera:
        // javac ArgumentosLineaDeComandos.java
        // java ArgumentosLineaDeComandos arg1 arg2 arg3 arg4 arg5 arg6 arg7 arg8 arg9 arg10
        // -encoding utf-8 // Para que se puedan imprimir caracteres especiales

        if (args.length == 0) {
            System.out.println("Se requieren argumentos para ejecutar el programa");
            System.exit(-1); // Termina la ejecución del programa
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }

        // Se puede ejecutar desde IDE con argumentos en la configuración de ejecución
        // Tres puntos en la parte superior derecha de la ventana de ejecución, luego en Edit Configurations
        // y en la pestaña de Program Arguments se pueden agregar los argumentos ejem: arg1 arg2 arg3 arg4

    }

}