import java.util.Map;

public class VariablesDeEntorno {
    public static void main(String[] args) {
        Map<String, String> variablesEnv = System.getenv(); // Obtiene todas las variables de entorno



        System.getenv().forEach((k, v) -> { // obtiene todas las variables de entorno
            System.out.println(k + " = " + v);
        });
        System.out.println("variablesEnv = " + variablesEnv); // Imprime todas las variables de entorno



        String username = System.getenv("USERNAME"); // Obtiene el valor de la variable de entorno USERNAME
        System.out.println("username = " + username); // Imprime el valor de la variable de entorno USERNAME
        String temp = System.getenv("TEMP"); // Obtiene el valor de la variable de entorno TEMP
        System.out.println("TEMP = " + temp); // Imprime el valor de la variable de entorno TEMP
        String saludo = System.getenv("SALUDAR_HOLA"); // Obtiene el valor de la variable de entorno SALUDO
        System.out.println("saludo = " + saludo); // Imprime el valor de la variable de entorno SALUDO
        //En la terminal se puede definir una variable de entorno con el comando export NOMBRE_VARIABLE=VALOR_VARIABLE
        //Ejemplo setx SALUDAR_HOLA "Hola que tal"  en windows
    }
}
