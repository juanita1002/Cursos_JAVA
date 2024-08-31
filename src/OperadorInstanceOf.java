public class OperadorInstanceOf {
    public static void main(String[] args) {

        // El operador instanceof se utiliza para saber si un objeto es de una clase en particular
        // o de una subclase de esa clase, es decir, si un objeto es instancia de una clase.
        // El operador instanceof devuelve true si el objeto es instancia de la clase especificada
        // y false en caso contrario.

        String texto  = new String( "Objeto de clase String");
        Integer numero = 10;

        Boolean b1 = texto instanceof String; // es un objeto de la clase String
        //Boolean b1 = texto instanceof Character; // no es un objeto de la clase Character sale error
        Boolean b2 = texto instanceof Object; // es un objeto de la clase Object
        Boolean b3 = numero instanceof Integer; // es un objeto de la clase Integer
        Boolean BA = b1 instanceof Boolean; // es un objeto de la clase Boolean

        System.out.println("b2 = " + b2);
        System.out.println("b1 = " + b1);
        System.out.println("b3 = " + b3);
        System.out.println("BA = " + BA);


        // tipos abstractos de datos (Object)
        Object texto2 = "Objeto de clase String";
        Object numero2 = 10;
        Boolean b4 = texto2 instanceof Object; // es un objeto de la clase Object
        Boolean b5 = texto2 instanceof String; // es un objeto de la clase String
        Boolean b6 = texto2 instanceof Integer; // no es un objeto de la clase Integer es un objeto de la clase String
        boolean b7 = numero2 instanceof Integer; // es un objeto de la clase Integer
        boolean b8 = numero2 instanceof String; //  no es un objeto de la clase String es un objeto de la clase Integer
        boolean b9 = numero2 instanceof Number; // es un objeto de la clase Number
        boolean b10 = numero2 instanceof Double; // no es un objeto de la clase Double es un objeto de la clase Integer
        boolean b11 = numero2 instanceof Float; // no es un objeto de la clase Float es un objeto de la clase Integer
        boolean b12 = numero2 instanceof Long; // no es un objeto de la clase Long es un objeto de la clase Integer

        System.out.println("b4 = " + b4);
        System.out.println("b5 = " + b5);
        System.out.println("b6 = " + b6);
        System.out.println("b7 = " + b7);
        System.out.println("b8 = " + b8);
        System.out.println("b9 = " + b9);
        System.out.println("b10 = " + b10);
        System.out.println("b11 = " + b11);
        System.out.println("b12 = " + b12);


        Integer numero3 = Integer.valueOf(10); //Forma correcta de crear un objeto de la clase Integer
        Boolean b13 = numero3 instanceof Integer; // es un objeto de la clase Integer
        System.out.println("b13 = " + b13);

        Double decimal = Double.valueOf(10.0); //Forma correcta de crear un objeto de la clase Double
        Boolean b14 = decimal instanceof Double; // es un objeto de la clase Double
        System.out.println("b14 = " + b14);

        Float float1 = Float.valueOf(10.0f); //Forma correcta de crear un objeto de la clase Float
        Boolean b15 = float1 instanceof Float; // es un objeto de la clase Float
        System.out.println("b15 = " + b15);





    }
}
