public class StrCadenas
{
    public static void main(String[] args) {
        //que es un string?
        //un string es un tipo de dato que representa una secuencia de caracteres
        //los string en java son objetos y se les puede aplicar metodos
        //un string es inmutable, es decir, no se puede modificar una vez creado
        //cada vez que se modifica un string se crea un nuevo objeto en memoria

        //declarar un string
        String nombre = "Juanita";
        System.out.println("Nombre = " + nombre);

        // incluir caracter comillas en un string
        String frase = "Este es un \"string\""; //para incluir comillas en un string se usa el caracter de escape \
        System.out.println("frase = " + frase);

        //concatenar strings
        String usuario = "Juanita";
        String  saludar = "Hola";
        String saludarUsuario = saludar + " " + usuario; //concatenar dos strings
        System.out.println("saludarUsuario = " + saludarUsuario);

        //usar metodo concat para concatenar strings
        String usuario0 = "Ivan";
        String  saludar0 = "Hola";
        String saludarUsuario0 = saludar0.concat(" ".concat(usuario0)); //concatenar dos strings
        System.out.println("saludarUsuario0 = " + saludarUsuario0);
        String saludiarUsuario1 = saludar0.concat(" ").concat(usuario0); //concatenar dos strings
        System.out.println("saludiarUsuario1 = " + saludiarUsuario1);


        //comparar dos strings
        String usuario1 = "Juanita";
        String usuario2 = "Juanita";
        boolean resultado = usuario1.equals(usuario2); //comparar dos strings
        System.out.println("resultado = " + resultado);

        //Usar metodo length
        String curso = "Programacion Java";
        int longitud = curso.length(); //obtener la longitud del string
        System.out.println("longitud = " + longitud);

        //usar metodo curso1.equalsIgnoreCase compara dos strings sin importar si son mayusculas o minusculas
        String curso1 = "Programacion Java";
        String curso2 = "programacion java";
        boolean resultado1 = curso1.equalsIgnoreCase(curso2); //comparar dos strings sin importar si son mayusculas o minusculas
        System.out.println("resultado1 = " + resultado1);

        //usar compareTo, es negativo si el primer string es menor que el segundo, es positivo si el primer string es mayor que el segundo y es cero si son iguales
        String curso3 = "Programacion Java";
        String curso4 = "Programacion PHP";
        int resultado2 = curso3.compareTo(curso4); //comparar dos strings
        System.out.println("resultado2 = " + resultado2);

        //usar metodo string trim para eliminar espacios en blanco al principio y al final de un string
        String texto = "    curso de programacion java    ";
        System.out.println("texto = " + texto); //imprimir el string con espacios en blanco
        System.out.println("texto.trim() = " + texto.trim()); //imprimir el string sin espacios en blanco

        //usar metodo charAt para obtener un caracter en una posicion especifica
        String texto1 = "curso de programacion java";
        char caracter = texto1.charAt(0); //obtener el caracter en la posicion 0
        System.out.println("caracter = " + caracter);

        //usar metodo tocharArray para convertir un string en un arreglo de caracteres
        String texto2 = "curso";
        char[] arreglo = texto2.toCharArray(); //convertir el string en un arreglo de caracteres
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("arreglo[" + i + "] = " + arreglo[i]);

        }
        System.out.println(" arreglo length = " + arreglo.length);

        //usar metodo substring para obtener una subcadena de un string
        String texto3 = "curso de programacion java";
        String subcadena = texto3.substring(9, 21); //obtener la subcadena de la posicion 9 a la 21
        System.out.println("subcadena = " + subcadena);

        //usar metodo indexOf para buscar la primera ocurrencia de un caracter en un string
        String texto4 = "curso de programacion java";
        int indice = texto4.indexOf("java"); //buscar la primera ocurrencia de la palabra java
        System.out.println("indice = " + indice);

        //usar metodo lastIndexOf para buscar la ultima ocurrencia de un caracter en un string
        String texto5 = "curso de programacion java";
        int indice1 = texto5.lastIndexOf("o"); //buscar la ultima ocurrencia de la letra a
        System.out.println("indice1 = " + indice1);

        //usar metodo startsWith para verificar si un string comienza con una subcadena
        String texto6 = "curso de programacion java";
        boolean resultado3 = texto6.startsWith("curso"); //verificar si el string comienza con la palabra curso
        System.out.println("resultado3 = " + resultado3);

        //usar metodo endsWith para verificar si un string termina con una subcadena
        String texto7 = "curso de programacion java";
        boolean resultado4 = texto7.endsWith("java"); //verificar si el string termina con la palabra java
        System.out.println("resultado4 = " + resultado4);

        //usar metodo contains para verificar si un string contiene una subcadena
        String texto8 = "curso de programacion java";
        boolean resultado5 = texto8.contains("programacion"); //verificar si el string contiene la palabra programacion
        System.out.println("resultado5 = " + resultado5);

        //usar metodo replace para reemplazar una subcadena por otra
        String texto9 = "curso de programacion java";
        String nuevoTexto = texto9.replace("java", "php"); //reemplazar la palabra java por php
        System.out.println("nuevoTexto = " + nuevoTexto);

        //usar metodo split para dividir un string en un arreglo de strings
        String texto10 = "curso de programacion java";
        String[] arreglo1 = texto10.split(" "); //dividir el string en un arreglo de strings cada vez que encuentre un espacio
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.println("arreglo1[" + i + "] = " + arreglo1[i]); //imprimir cada elemento del arreglo de strings
        }
        System.out.println("arreglo1.length = " + arreglo1.length);

        //cuando se usa split con un punto se debe usar el caracter de escape \\.
        String textoN = "curso.de.programacion.java";
        String[] arregloN = textoN.split("\\."); //dividir el string en un arreglo de strings cada vez que encuentre un punto o usar corchetes [.] para dividir por punto
        for (int i = 0; i < arregloN.length; i++) {
            System.out.println("arregloN[" + i + "] = " + arregloN[i]); //imprimir cada elemento del arreglo de strings
        }

        //usar metodo toUpperCase para convertir un string a mayusculas
        String texto11 = "curso de programacion java";
        String textoMayusculas = texto11.toUpperCase(); //convertir el string a mayusculas
        System.out.println("textoMayusculas = " + textoMayusculas);

        //usar metodo toLowerCase para convertir un string a minusculas
        String texto12 = "CURSO DE PROGRAMACION JAVA";
        String textoMinusculas = texto12.toLowerCase(); //convertir el string a minusculas
        System.out.println("textoMinusculas = " + textoMinusculas);

        //usar metodo format para formatear un string
        String resultado6 = String.format("El resultado de la suma de %d + %d es %d", 5, 3, 5 + 3); //formatear un string
        System.out.println("resultado6 = " + resultado6);

        //usar metodo valueOf para convertir un tipo de dato a string
        int numero = 10;
        String numeroStr = String.valueOf(numero); //convertir un entero a string
        System.out.println("numeroStr = " + numeroStr);

        //usar metodo transform para aplicar una funcion a un string
        String texto13 = "curso de programacion java";
        String resultado7 = texto13.transform(s -> s.toUpperCase()); //convertir el string a mayusculas
        System.out.println("resultado7 = " + resultado7);

    }
}
