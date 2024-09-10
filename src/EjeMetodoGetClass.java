import java.lang.reflect.Method;

public class EjeMetodoGetClass {
    public static void main(String[] args) {

        // getClass() es un método de la clase Object que devuelve un objeto de tipo Class

        // Imprime los métodos de la clase String
        String s = "Hola como estas el dia de hoy";
        Class strClass = s.getClass();
        System.out.println("Nombre de la clase String = " + strClass); // Imprime el nombre de la clase String
        System.out.println("Nombre de la clase String = " + strClass.getName()); // Imprime el nombre de la clase String
        System.out.println("Paquete de la clase String = " + strClass.getPackageName()); // Imprime el paquete de la clase String
        System.out.println("Nombre simple de la clase String = " + strClass.getSimpleName()); // Imprime el nombre simple de la clase String
        System.out.println("\n");
        for (Method metodos : strClass.getMethods()) {
            System.out.println("m.getName() = " + metodos.getName()); // Imprime los métodos de la clase String
        }


        // Imprime los métodos de la clase Integer

        System.out.println("\n");

        Integer i = 10;
        Class intClass = i.getClass();
        System.out.println("Nombre de la clase Integer = " + intClass); // Imprime el nombre de la clase Integer
        System.out.println("Nombre de la clase Integer = " + intClass.getName()); // Imprime el nombre de la clase Integer
        System.out.println("Paquete de la clase Integer = " + intClass.getPackage()); // Imprime el paquete de la clase Integer
        System.out.println("Nombre simple de la clase Integer = " + intClass.getSimpleName()); // Imprime el nombre simple de la clase Integer
        System.out.println("Paquete de la clase Integer Nombre = " + intClass.getPackageName()); // Imprime el paquete de la clase Integer
        System.out.println("La clase padre de la clase Integer = " + intClass.getSuperclass()); // Imprime la clase padre de la clase Integer
        System.out.println("La clase padre de la clase padre de la clase Integer = " + intClass.getSuperclass().getSuperclass()); // Imprime la clase padre de la clase padre de la clase Integer
        System.out.println("\n");
        for (Method metodos2 : intClass.getMethods()) {
            System.out.println("m.getName() = " + metodos2.getName()); // Imprime los métodos de la clase Integer
        }

        // Metodo getClass() de la clase Object

        System.out.println("\n");

        Class objClass = i.getClass().getSuperclass().getSuperclass();
        System.out.println("Nombre de la clase Object = " + objClass); // Imprime el nombre de la clase Object

        for (Method metodos3 : objClass.getMethods()) {
            System.out.println("m.getName() = " + metodos3.getName()); // Imprime los métodos de la clase Object
        }





    }
}
