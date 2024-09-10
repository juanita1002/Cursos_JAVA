import java.util.Scanner;

public class PromedioClases {
    public static void main(String arg[]){
        String[] materias = {"Matemáticas", "Química", "Biología", "Física"};
        double[] calificaciones = {0.0, 0.0, 0.0, 0.0};
        double Promedio = 0.0;
        String resultado = "";
        double suma = 0.0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < materias.length; i++)
        {
            System.out.println("Escribir nota de " + materias[i] + ", " + "Calificacion maxima 5,0:");
            calificaciones[i] = sc.nextDouble();
        }

        for (int i = 0; i < calificaciones.length; i++)
        {
            suma+=calificaciones[i];
            System.out.println( materias[i] + " " + calificaciones[i]);


        }
        Promedio = suma / calificaciones.length;
        System.out.println("Promedio = " + Promedio);
        resultado = (Promedio >= 3) ? "Aprobado":"Reprobado";
        System.out.println("Resultado = " + resultado);


    }
}
