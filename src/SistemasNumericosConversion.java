import javax.swing.*;


public class SistemasNumericosConversion {
    public static void main(String[] args) {
        // Ejemplo de conversion de tipos
        String numero = "0";

        try {
            numero = JOptionPane.showInputDialog(null, "Introduce un número decimal", "Sistemas numéricos", JOptionPane.INFORMATION_MESSAGE);
            Integer.parseInt(numero);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Por favor introduce un número entero válido", "Error", JOptionPane.ERROR_MESSAGE);
            main(args); // Volver a llamar al método main
            System.exit(0); // Salir del programa
        }

        JOptionPane.showMessageDialog(null,"numero = " + numero);

        // Convertir de decimal a binario
        String binario = Integer.toBinaryString(Integer.parseInt(numero));
        JOptionPane.showMessageDialog(null,numero + " en binario = " + binario);
        // Convertir de decimal a octal
        String octal = Integer.toOctalString(Integer.parseInt(numero));
        JOptionPane.showMessageDialog(null, numero + " en octal = " + octal);
        // Convertir de decimal a hexadecimal
        String hexadecimal = Integer.toHexString(Integer.parseInt(numero));
        JOptionPane.showMessageDialog(null, numero + " en hexadecimal = " + hexadecimal);


        // Mostrar todos los resultados en una sola ventana de diálogo
        String mensaje = String.format("%s en binario = %s\n%s en octal = %s\n%s en hexadecimal = %s",
                numero, binario, numero, octal, numero, hexadecimal);
        JOptionPane.showMessageDialog(null, mensaje, "Resultados de Conversión", JOptionPane.INFORMATION_MESSAGE);

    }
}
