
    class Persona{
        private String nombre;

        public void modificarNombre(String nuevoNombre){

            this.nombre = nuevoNombre;
        }

        public String leerNombre(){
            return this.nombre;
        }
    }


    public class PasarPorReferencia2 {
        public static void main(String[] args) {
            Persona persona= new Persona();
            persona.modificarNombre("Juanita");
            System.out.println("Iniciamos con el metodo main");
            System.out.println("persona.nombre = " + persona.leerNombre());

            System.out.println("Antes de invocar el metodo test");

            test(persona);

            System.out.println("Despues de invocar el metodo test desde el main");

            System.out.println("persona.nombre = " + persona.leerNombre());

        }

        public static void test(Persona persona) {
            System.out.println("Iniciamos el metodo test con ");
           persona.modificarNombre("Pedro");
            System.out.println("Finaliza el metodo test con");

        }
    }


