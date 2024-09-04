public class SentenciaForEach {
    public static void main(String[] args) {
        // for each es una estructura de control que permite recorrer un array o una colección de elementos

        int[] numeros = {1, 2, 3, 4, 5};
        for(int numero : numeros) {
            System.out.println(numero);
        }

        String[] nombres = {"Juan", "Pedro", "Luis"};
        for(String nom: nombres) {
            System.out.println(nom);
        }
     }
}
