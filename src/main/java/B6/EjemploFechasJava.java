package B6;
import java.time.LocalTime;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EjemploFechasJava {
    public static void main(String[] args) {
        // Utilizando java.util.Date
        Date fechaActualUtil = new Date();
        System.out.println("Fecha y Hora Actual (java.util.Date): " + fechaActualUtil);

        Date fechaEspecificaUtil = new Date(0, 0, 23); // Año 2022 (año - 1900), mes (0-11), día
        System.out.println("Fecha Específica (java.util.Date): " + fechaEspecificaUtil);

        // Utilizando java.time.LocalDate y java.time.LocalDateTime
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha Actual (java.time.LocalDate): " + fechaActual);

        LocalDate fechaEspecifica = LocalDate.of(2022, 1, 23); // Año, mes, día
        System.out.println("Fecha Específica (java.time.LocalDate): " + fechaEspecifica);

        System.out.println(LocalTime.now());
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        System.out.println("Fecha y Hora Actual (java.time.LocalDateTime): " + fechaHoraActual);

        // Formatear la fecha y hora como cadena utilizando java.time.format.DateTimeFormatter
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String fechaHoraFormateada = fechaHoraActual.format(formato);
        System.out.println("Fecha y Hora Formateada: " + fechaHoraFormateada);
    }
}