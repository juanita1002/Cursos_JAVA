import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance(); // Crear un objeto Calendar de la clase java.util.Calendar
        //calendario.set(2020, 10, 1, 14, 0, 0); // Establecer la fecha y hora presentes o pasadas
         calendario.set(Calendar.YEAR, 2028);
         calendario.set(Calendar.MONTH, Calendar.FEBRUARY);
         calendario.set(Calendar.DAY_OF_MONTH, 1);
         calendario.set(Calendar.HOUR_OF_DAY, 2);
         calendario.set(Calendar.MINUTE, 30);
         calendario.set(Calendar.SECOND, 50);
         calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime(); // Crear un objeto Date de la clase java.util.Date

        System.out.println("Fecha sin formato = " + fecha); // Imprimir fecha sin formato
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss:SSS aaa"); // Crear un objeto SimpleDateFormat
        System.out.println("Fecha con formato = " + df.format(fecha)); // Imprimir la fecha y hora actual con el formato especificado

    //Convertir de un String a un Date

        SimpleDateFormat df2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); //Se debe ingresar fecha con este formato
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la fecha en formato dd-MM-yyyy HH:mm:ss");
        String fechaTexto = sc.nextLine();

        try {
            Date fecha2 = df2.parse(fechaTexto);//Se debe ingresar fecha con este formato
            String fechaTexto2 = df.format(fecha2); //Se debe ingresar fecha con este formato
            System.out.println("fecha2 = " +  fechaTexto2); // Imprimir la fecha y hora actual con el formato especificado
        } catch (ParseException e) {
            System.out.println("Error: " + e.getMessage());
           // throw new RuntimeException(e);
            
        }


    }
}
