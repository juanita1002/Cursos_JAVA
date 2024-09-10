import java.util.Random;

public class MathClase {
    public static void main(String[] args) {
        System.out.println("Math.PI = " + Math.PI); // Valor de PI
        System.out.println("Math.E = " + Math.E); // Valor de E (Número de Euler)
        System.out.println("Math.abs(-5) = " + Math.abs(-5)); // Valor absoluto de un número entero o decimal
        System.out.println("Math.abs(5) = " + Math.abs(5)); // Valor absoluto de un número entero o decimal
        System.out.println("Math.ceil(6.1) = " + Math.ceil(6.1)); // Redondea hacia arriba (Techo)
        System.out.println("Math.floor(5.9) = " + Math.floor(8.9)); // Redondea hacia abajo (Piso)
        System.out.println("Math.max(5, 10) = " + Math.max(15, 10)); // Devuelve el número mayor
        System.out.println("Math.min(2, 10) = " + Math.min(2, 10)); // Devuelve el número menor
        System.out.println("Math.min(5.2, 10.4) = " + Math.min(5.2, 10.4)); // Devuelve el número menor double
        System.out.println("Math.round(5.5) = " + Math.round(7.5)); // Redondea al número entero más cercano
        System.out.println("Math.round(5.4) = " + Math.round(7.4)); // Redondea al número entero más cercano

        System.out.println("Math.pow(2, 3) = " + Math.pow(2, 3)); // Devuelve el número elevado a la potencia
        System.out.println("Math.sqrt(25) = " + Math.sqrt(25)); // Devuelve la raíz cuadrada
        System.out.println("Math.cbrt(27) = " + Math.cbrt(27)); // Devuelve la raíz cúbica
        System.out.println("Math.exp(1) = " + Math.exp(2)); // Devuelve el número de Euler elevado a la potencia de x
        System.out.println("Math.log(2) = " + Math.log(10)); // Devuelve el logaritmo natural de x
        System.out.println("Math.toDegrees(Math.PI) = " + Math.toDegrees(Math.PI)); // Convierte radianes a grados
        System.out.println("Math.toRadians(180) = " + Math.toRadians(180)); // Convierte grados a radianes
        System.out.println("Math.sin(Math.toRadians(90)) = " + Math.sin(Math.toRadians(90))); // Devuelve el seno de un ángulo
        System.out.println("Math.cos(Math.toRadians(0)) = " + Math.cos(Math.toRadians(180))); // Devuelve el coseno de un ángulo
        System.out.println("Math.cos(Math.toRadians(0)) = " + Math.cos(Math.toRadians(0))); // Devuelve el coseno de un ángulo

        int a = Math.multiplyExact(2, 3); // Multiplicación exacta
        System.out.println("a = " + a);

        double random1 = Math.random();
        System.out.println("random = " + random1); // Número aleatorio entre 0 y 1

        double random2 = Math.random() * 10;
        System.out.println("random2 = " + random2);
        random2 = Math.round(random2); // Redondear el número
        System.out.println("random2 redondeado= " + random2); // Número aleatorio entre 0 y 10


        String[] colores = {"Rojo", "Azul", "Verde", "Amarillo", "Negro", "Blanco"};
        double random3 = Math.random() * colores.length;
        String color  = colores[(int) random3];
        System.out.println("colores = " + color + " Esta en la Posicion: " + (int)random3 );

       //Ramdom con objetos
        Random ram = new Random();
        int ramd = ram.nextInt(1000,2000); //
        double ramd2 = ram.nextDouble(10,20);
        int ramd3 = ram.nextInt(color.length());


        System.out.println("ram = " +  ramd  );
        System.out.println("ramd2 = " + ramd2);
        System.out.println("colores = " + colores[ramd3]);

    }
}
