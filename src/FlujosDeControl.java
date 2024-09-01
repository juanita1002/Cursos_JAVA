public class FlujosDeControl {
    public static void main(String[] args) {

      // if es una estructura de control que permite ejecutar un bloque de código si se cumple una condición
      // else if es una estructura de control que permite ejecutar un bloque de código si no se cumple la condición del if
      // else es una estructura de control que permite ejecutar un bloque de código si no se cumple la condición del if o del else if

        int numero = 10;

        if (numero > 0) {
         System.out.println("El número es positivo");
         } else if (numero > 0) {
             System.out.println("El número es negativo");
         }else {
             System.out.println("El número es cero");
         }

     // switch es una estructura de control que permite ejecutar un bloque de código dependiendo del valor de una variable

        switch (numero) {  // Soporta byte, short, int, char, String y enum
            case 1:
                System.out.println("El número es 1");
                break; // break es una palabra reservada que permite salir del switch si se cumple la condición para evitar que se ejecuten los demás casos
            case 2:
                System.out.println("El número es 2");
                break;
            case 3:
                System.out.println("El número es 3");
                break;
            default:
                System.out.println("El número no es 1, 2 o 3");
                break;
        }


        // Separadores
        // () -> Parentesis
        // {} -> Llaves
        // [] -> Corchetes
        // ; -> Punto y coma
        // , -> Coma
        // . -> Punto
        // : -> Dos puntos
        // ? -> Signo de interrogación
        // ! -> Signo de exclamación


    }
}
