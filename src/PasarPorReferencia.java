public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad = {10, 20, 30, 40, 50};
        System.out.println("Iniciamos con el metodo main");
          for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[" + i + "] = " + edad[i]);
            }

        System.out.println("Antes de invocar el metodo test");
        test(edad);
        System.out.println("Despues de invocar el metodo test desde el main");

        for (int i = 0; i < edad.length; i++) {
            System.out.println("edad[" + i + "] = " + edad[i]);
            }
        System.out.println("Finaliza el metodo main"); // i = 35 porque es un objeto
    }

    public static void test(int[] edadArray) {
        System.out.println("Iniciamos el metodo test con ");
        for (int i = 0; i < edadArray.length; i++) {

            edadArray[i] = edadArray[i] + 20;
            System.out.println("edadArray[" + i + "] = " + edadArray[i]);
            }

        System.out.println("Finaliza el metodo test con");

    }
}
