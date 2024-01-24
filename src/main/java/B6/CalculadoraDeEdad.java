package B6;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

//Calculadora de Edad:
//Escribe un programa que tome la fecha de nacimiento de una persona como entrada y calcule su edad en años, meses y días.
public class CalculadoraDeEdad {

    //1) pedir los datos con scanner (YYYY-MM-DD)
    //2) Period   ==Period period = Period.beeween(FechaNacimiento,FechaActual)
    //3) comparar año con año , mes con mes. dia con dia,
    //4) Decir el resultado

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            LocalDate fechaNacimiento = null;
            boolean fechaValida = false;

            do {
                try {
                    System.out.print("Ingrese su fecha de nacimiento (YYYY-MM-DD): ");
                    String fechaNacimientoStr = scanner.nextLine();
                    fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
                    fechaValida = true;
                } catch (DateTimeParseException e) {
                    System.out.println("Formato de fecha incorrecto. Por favor, ingrese la fecha en el formato correcto.");
                }
            }while (!fechaValida);

            // Calcular la edad utilizando la clase Period
            LocalDate fechaActual = LocalDate.now();
            Period periodo = Period.between(fechaNacimiento, fechaActual);

            // Mostrar la edad en años, meses y días
            System.out.println("Tu edad es: " + periodo.getYears() + " años, " +
                    periodo.getMonths() + " meses y " +
                    periodo.getDays() + " días.");


        }catch (RuntimeException e){

        }finally {
            scanner.close();
        }
    }

}

