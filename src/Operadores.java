public class Operadores {
    public static void main(String[] args) {

        // Operadores aritméticos
        int a = 10;
        int b = 5;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
                //División flotante
                int a4 = 10;
                int b4 = 3;
                System.out.println("División flotante: " + (a4 /b4));
                System.out.println("División flotante: " + ((float)a4 / (float) b4));

        System.out.println("Módulo: " + ((float)a4 % (float) b4));


        //incremento

        int a2 = 20;
        System.out.println("Incremento: " + (a2++)); //a = a + 1 -> a += 1   incrementa después de la operación
        int a3 = 20;
        System.out.println("Incremento: " + (++a3)); //a = a + 1 -> a += 1   incrementa antes de la operación

        //decremento
        int b2 = 20;
        System.out.println("Decremento: " + (b2--)); //a = a - 1 -> a -= 1   decrementa después de la operación
        int b3 = 20;
        System.out.println("Decremento: " + (--b3)); //a = a - 1 -> a -= 1   decrementa antes de la operación

        //Operadores unarios
        //Se utiliza para cambiar el signo de un número
        System.out.println("Menos unario: " + (-a2));  //cambia el signo de positivo a negativo
        System.out.println("Más unario: " + (+a2));  //cambia el signo de negativo a positivo


        //operadores combinados
        //Se utiliza para abreviar la operación ejem: a = a + b; se puede abreviar a += b;
        a += b;
        System.out.println("Suma y asignación: " + a);

                //abreviaciones con strings
                int id = 1;
                String nombre = "Juana";
                String sqlString = "Selec * from tabla" ;
                sqlString += " where id " + id;
                sqlString += " and nombre " + nombre;

                System.out.println("Sql String: " + sqlString);

        a -= b;
        System.out.println("Resta y asignación: " + a);
        a *= b;
        System.out.println("Multiplicación y asignación: " + a);
        a /= b;
        System.out.println("División y asignación: " + a);
        a %= b;
        System.out.println("Módulo y asignación: " + a);

        //Operador ternario o condicional
            // variable = (condición) ? expresión1 : expresión2
            //Si la condición es verdadera entonces variable = expresión1, de lo contrario variable = expresión2

        int c = 10;
        int d = 5;
        int resultado = (c > d) ? c:d; //Si c es mayor que d entonces resultado = c, de lo contrario resultado = d
        System.out.println("El número mayor es: " + resultado);
        int resultado2 = (c > d) ? 1:0; //Si c es mayor que d entonces resultado = 1, de lo contrario resultado = 0
        System.out.println("El resultado es: " + resultado2);
        int resultado3 = (c < d) ? 1:0; //Si c es menor que d entonces resultado = 1, de lo contrario resultado = 0
        System.out.println("El resultado es: " + resultado3);
        String variable = (c > d) ? "Verdadero":"Falso"; //Si c es mayor que d entonces variable = "Verdadero", de lo contrario variable = "Falso"
        System.out.println("El resultado es: " + variable);// "Verdadero" Si c es mayor que d es verdadero
        String variable2 = (c > d) ? "Verdadero":"Falso"; System.out.println("El resultado es: " + variable2);



        //Operadores relacionales
        // ==, !=, >, <, >=, <= devuelve un valor booleano true o false
        System.out.println("Igualdad: " + (c == d)); //false
        System.out.println("Desigualdad: " + (c != d)); //true
        System.out.println("Mayor que: " + (c > d));  //true
        System.out.println("Menor que: " + (c < d));  //false
        System.out.println("Mayor o igual que: " + (c >= d)); //true
        System.out.println("Menor o igual que: " + (c <= d)); //false


        //Operadores lógicos
        // &&, ||, ! , & , |, ^  Se utilizan para realizar operaciones lógicas entre dos valores booleanos
        // && y lógico, || o lógico, ! negación lógica, & y lógico, | o lógico, ^ o exclusivo

        int a1 = 15;
        int b1 = 9;
        int c1 = 20;
        int d1 = 10;
        System.out.println("Operador &&: " + ((a1 > b1) && (c1 > d1))); //true and true = true
        System.out.println("Operador ||: " + ((a1 > b1) || (c1 < d1))); //true or false = true
        System.out.println("Operador !: " + !(a1 > b1)); //false    !true = false negación lógica
        System.out.println("Operador & : " + ((a1 > b1) & (c1 > d1))); //true y lógico
        System.out.println("Operador | : " + ((a1 > b1) | (c1 < d1))); //true o lógico
        System.out.println("Operador ^ : " + ((a1 > b1) ^ (c1 < d1))); //false o exclusivo

        //tabla de verdad
        //AND
        //true && true = true
        //true && false = false
        //false && true = false
        //false && false = false

        //OR
        //true || true = true
        //true || false = true
        //false || true = true
        //false || false = false

        //NOT
        //!true = false
        //!false = true

        //XOR o exclusivo si ambos son iguales devuelve false, si son diferentes devuelve true
        //true ^ true = false
        //true ^ false = true
        //false ^ true = true
        //false ^ false = false

        //Precedencia de operadores
        //1. ()
        //2. ++, --, +, - (unarios)
        //3. *, /, %
        //4. +, -
        //5. <, >, <=, >=
        //6. ==, !=
        //7. &&
        //8. ||
        //9. =, +=, -=, *=, /=, %=



    }
}
