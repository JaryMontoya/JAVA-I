package EJERCICIOS;

import java.util.Scanner;

public class CalculadoraDeFactorial {
    // Método para calcular el factorial de un número
    static long calcularFactorial(int numero) {
        long factorial = 1;
        // Utilizamos un bucle for para multiplicar los números desde 1 hasta el número ingresado
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero para calcular su factorial: ");
        int numeroUsuario = scanner.nextInt();

        // Verificar si el número ingresado es negativo
        if (numeroUsuario < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            // Calcular y mostrar el factorial
            long resultadoFactorial = calcularFactorial(numeroUsuario);
            System.out.println("El factorial de " + numeroUsuario + " es: " + resultadoFactorial);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
