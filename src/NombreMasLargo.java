import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {

        String persona1 = JOptionPane.showInputDialog("Ingresa primer  el nombre y apellido :");
        String persona2 = JOptionPane.showInputDialog("Ingresa segundo el nombre y apellido :");
        String persona3 = JOptionPane.showInputDialog("Ingresa tercer el nombre y apellido :");

        JOptionPane.showMessageDialog(null, "Nombre 1: " + persona1 + "\nNombre 2: " + persona2 + "\nNombre 3: " + persona3);


        String masLargo = persona1.split(" ")[0].length()  >  persona2.split(" ")[0].length() ? persona1 : persona2;
        String maslargo = (masLargo.split(" ")[0]).length() >  persona3.split(" ")[0].length() ? masLargo : persona3;

        JOptionPane.showMessageDialog(null, "La persona con el nombre mas largo es " + maslargo);


    }
}
