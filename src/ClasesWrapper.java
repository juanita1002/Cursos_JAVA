import java.util.Scanner;

public class ClasesWrapper {
    public static void main(String[] args) {
        // byte Byte
        // short Short
        // int Integer
        // long Long
        // float Float
        // double Double
        // char Character
        // boolean Boolean
        // void Void


        //Constantes de Integer
        int minI = Integer.MIN_VALUE;
        System.out.println("min = " + minI);
        int maxI = Integer.MAX_VALUE;
        System.out.println("max = " + maxI);

        //Constantes de Long
        long minL = Long.MIN_VALUE;
        System.out.println("minL = " + minL);
        long maxL = Long.MAX_VALUE;
        System.out.println("maxL = " + maxL);

        //Constantes de Float
        float minF = Float.MIN_VALUE;
        System.out.println("minF = " + minF);
        float maxF = Float.MAX_VALUE;
        System.out.println("maxF = " + maxF);


        //Constantes de Double
        double minD = Double.MIN_VALUE;
        System.out.println("minD = " + minD);
        double maxD = Double.MAX_VALUE;
        System.out.println("maxD = " + maxD);
        double infinitoP = Double.POSITIVE_INFINITY;
        System.out.println("infinitoP = " + infinitoP);
        double infinitoN = Double.NEGATIVE_INFINITY;
        System.out.println("infinitoN = " + infinitoN);

        //Metodos estaticos de las demas clases
        int sI = Integer.parseInt("250");
        System.out.println("sI = " + sI); //Convierte un String a un entero
        long sL = Long.parseLong("300");
        System.out.println("sL = " + sL); //Convierte un String a un long
        float sF = Float.parseFloat("350");
        System.out.println("sF = " + sF); //Convierte un String a un float
        double sD = Double.parseDouble("400");
        System.out.println("sD = " + sD); //Convierte un String a un double

        //Metodos de instancia de las demas clases
        System.out.println("Ingresa un numero entero: ");
        Scanner sc = new Scanner(System.in);
        Integer num1 = Integer.valueOf(sc.nextInt()); //Convierte un entero a un objeto Integer
        System.out.println("num1 = " + num1);

        int num2 = num1.intValue(); //Convierte un objeto Integer a un entero
        System.out.println("num2 = " + num2);
        long num3 = num1.longValue(); //Convierte un objeto Integer a un long
        System.out.println("num3 = " + num3);
        float num4 = num1.floatValue(); //Convierte un objeto Integer a un float
        System.out.println("num4 = " + num4);
        double num5 = num1.doubleValue(); //Convierte un objeto Integer a un double
        System.out.println("num5 = " + num5);


        String num6 = Integer.toString(num1); //Convierte un entero a un String
        System.out.println("num6 = " + num6);


        //Metodos estaticos
        String iS = Integer.toString(100,2); //Convierte un entero a un String en base 2 (binario)
        System.out.println("j = " + iS);
        String iS10 = Integer.toString(100); //Convierte un entero a un String en base 10
        System.out.println("j = " + iS10);
        Integer o = Integer.valueOf("300");//Convierte un String a un objeto Integer
        System.out.println("o = " + o);




        //Metodos de intancia
        Integer m = 100;
            int f = m.intValue(); //Convierte un objeto Integer a un entero
            System.out.println("f = " + f);
            long g = m.longValue(); //Convierte un objeto Integer a un long
            System.out.println("g = " + g);
            float h = m.floatValue(); //Convierte un objeto Integer a un float
            System.out.println("h = " + h);
            double i = m.doubleValue(); //Convierte un objeto Integer a un double
            System.out.println("i = " + i);


            String p = m.toString(); //Convierte un objeto Integer a un String
            System.out.println("p = " + p);
            String q = m.toString(2); //Convierte un objeto Integer a un String en base 2 (binario)
            System.out.println("q = " + q);
            int r = m.compareTo(o); //Compara dos objetos Integer
            System.out.println("r = " + r);
            int s = m.hashCode(); //Devuelve el codigo hash del objeto Integer
            System.out.println("s = " + s);
            boolean t = m.equals(o); //Compara dos objetos Integer
            System.out.println("t = " + t);

            // char Character
            char c = 'a';
            Character cObj = c;
            System.out.println("c = " + c);

            char c1 = Character.toUpperCase(c);
            System.out.println("c1 = " + c1);   //Convierte un caracter a mayuscula
            char c2 = Character.toLowerCase(c);
            System.out.println("c2 = " + c2); //Convierte un caracter a minuscula

            boolean c3 = Character.isDigit(c);
            System.out.println("c3 = " + c3); //Determina si un caracter es un digito
            boolean c4 = Character.isLetter(c);
            System.out.println("c4 = " + c4); //Determina si un caracter es una letra
            boolean c5 = Character.isLetterOrDigit(c);
            System.out.println("c5 = " + c5); //Determina si un caracter es una letra o un digito
            boolean c6 = Character.isSpaceChar(c);
            System.out.println("c6 = " + c6); //Determina si un caracter es un espacio en blanco
            boolean c7 = Character.isWhitespace(c);
            System.out.println("c7 = " + c7); //Determina si un caracter es un espacio en blanco


        // boolean Boolean
        Boolean bT = Boolean.TRUE;
        System.out.println("bT = " + bT);
        Boolean bF = Boolean.FALSE;
        System.out.println("bF = " + bF);






    }
}
