public class StrValidar {
    public static void main(String[] args) {
        String Curso = " ";

        //hacer try catch si es nulo
        boolean esNulo = Curso == null;
        try {
            System.out.println("Curso es nulo: " + esNulo); // true

            boolean esVacio = Curso.length() == 0 || Curso.isEmpty() || Curso.trim().length() == 0 || Curso.equals("") || Curso.isBlank(); //
            System.out.println("esVacio = " + esVacio);
            if (esVacio) {
                System.out.println("Curso es vacio");
            } else {
                System.out.println("Curso no es vacio");
            }

        } catch (Exception e) {
            System.out.println("Error: Curso esta Nulo " + e.getMessage()); // Error: java.lang.NullPointerException
        }




        
        



    }
}
