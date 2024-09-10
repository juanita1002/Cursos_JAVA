import java.text.SimpleDateFormat; // Importar la clase SimpleDateFormat de java.text
import java.util.Date; // Importar la clase Date de java.util

public class JavaUtilDate {
    public static void main(String[] args) {
        Date fecha = new Date(); // Crear un objeto Date de la clase java.util.Date, se debe importar la clase Date
        System.out.println("date = " + fecha);// Imprimir la fecha y hora actual

        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy HH:mm:ss"); // Crear un objeto SimpleDateFormat
        System.out.println("df = " + df.format(fecha)); // Imprimir la fecha y hora actual con el formato especificado

        SimpleDateFormat df2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        // con -
        // numeros en vez de letras ese es con MMMM
        System.out.println("df2 = " + df2.format(fecha));

        SimpleDateFormat df3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        // con / en vez de -
        System.out.println("df3 = " + df3.format(fecha));

        SimpleDateFormat df4 = new SimpleDateFormat("E dd MMM yyyy HH:mm:ss");
        //MMM: Mes en texto corto
        // E: Dia de la semana corto
        System.out.println("df4 = " + df4.format(fecha));

        SimpleDateFormat df5 = new SimpleDateFormat("'Fecha: 'EEEE dd MMM yyyy 'Hora' KK:mm:ss aaa");
        //KK: Hora en formato de 12 horas
        // aaa: AM o PM
        // 'Hora' es un texto toca con comillas simples
        // EEEE: Dia de la semana completo
        System.out.println("df5 = " + df5.format(fecha));

        // SimpleDateFormat se consulta por internet para ver los formatos que se pueden usar


        // get.time() devuelve la fecha en milisegundos
        long j = 0;
        j = fecha.getTime();
        System.out.println("j = " + j);
    }
}
