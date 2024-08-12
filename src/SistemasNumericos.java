public class SistemasNumericos {
    public static void main(String[] args) {

        //Numero decimal
        int numeroDecimal =10;
        System.out.println("numeroDecimal = " + numeroDecimal);

        //Numero binario
        int numeroBinario = 0b1010;
        System.out.println("numeroBinario = " + numeroBinario);

        //Numero octal
        int numeroOctal = 012;
        System.out.println("numeroOctal = " + numeroOctal);

        //Numero hexadecimal
        int numeroHexadecimal = 0xA;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);


        System.out.println("\n Convertir un número decimal a binario, octal y hexadecimal");

        //Convertir de binario a decimal
        String binarioString = "1010";
        System.out.println(binarioString + " en  binario = " + Integer.parseInt(binarioString, 2));

        //Convertir de octal a decimal
        String octalString = "12";
        System.out.println(octalString + " octal = " + Integer.parseInt(octalString, 8));

        //Convertir de hexadecimal a decimal
        String hexadecimalString = "A";
        System.out.println(hexadecimalString + " hexadecimal = " + Integer.parseInt(hexadecimalString, 16));



    }
}
