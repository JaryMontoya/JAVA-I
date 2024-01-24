package EJERCICIOS;

import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Ingresa la unidad (C para Celsius, F para Fahrenheit): ");
        char unidad = scanner.next().charAt(0);

        if (unidad == 'C' || unidad == 'c') {
            double fahrenheit = celsiusToFahrenheit(temperatura);
            System.out.println(temperatura + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");
        } else if (unidad == 'F' || unidad == 'f') {
            double celsius = fahrenheitToCelsius(temperatura);
            System.out.println(temperatura + " grados Fahrenheit equivalen a " + celsius + " grados Celsius.");
        } else {
            System.out.println("Unidad no válida. Ingresa 'C' o 'F'.");
        }

        scanner.close();
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
