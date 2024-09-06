public class PasarPorValor {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("Iniciamos con el metodo main i = " + i);
        test(i);
        System.out.println("Finaliza el metodo main = " + i); // i = 10 porque es un valor primitivo
    }

    public static void test(int i) {
        System.out.println("Iniciamos el metodo test con i = " + i);

        i = 35 ;
        System.out.println("Finaliza el metodo test con i = " + i);

    }

}
