import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class FechaNacimiento {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");

            Date fechaSystem = new Date();
            System.out.println("Fecha de actual: " + ft.format(fechaSystem));

            System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
            String fechaNacimiento = sc.nextLine();
            Date fechaNacimiento2 = ft.parse(fechaNacimiento);//parse convierte un string a un objeto Date

            System.out.println("Fecha de nacimiento: " + fechaNacimiento);

            Long edad = (fechaSystem.getTime() - fechaNacimiento2.getTime()) / 1000 / 60 / 60 / 24 / 365;
            //getTime() devuelve la fecha en milisegundos y se divide para obtener la edad en años
            // 1000 milisegundos, 60 segundos, 60 minutos, 24 horas, 365 dias


            System.out.println("Edad: " + edad);


        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }




    }
}
