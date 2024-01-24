package EJERCICIOS;

import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        //Operacion
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        System.out.print("Ingresa el número de la operación que deseas realizar (1/2/3/4): ");
        int opcion = scanner.nextInt();

        // Realizar la operación seleccionada
        double resultado = 0.0;
        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                break;
            case 2:
                resultado = restar(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                resultado = dividir(num1, num2);
                break;
            default: System.out.println("Opción no válida. Por favor, ingresa un número válido (1/2/3/4).");

        }

        // Mostrar el resultado al usuario
        System.out.println("El resultado es: " + resultado);
    }

    // Métodos para realizar operaciones
    public static double sumar(double x, double y) {
        return x + y;
    }

    public static double restar(double x, double y) {
        return x - y;
    }

    public static double multiplicar(double x, double y) {
        return x * y;
    }

    public static double dividir(double x, double y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("No es posible dividir entre cero.");
            return Double.NaN; // NaN (Not a Number) para indicar que el resultado no es un número válido
        }
    }
}
