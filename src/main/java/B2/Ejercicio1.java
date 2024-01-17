package B2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String [] args) {

        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dígite el primer número");
        num1 = scanner.nextInt();

        //Hace el ingreso del segundo dato
        System.out.println("Digíte el segundo número");
        num2 = scanner.nextInt();

        //Hacer operaciones
        double suma = num1 + num2;

        //Mostrar resultados
        System.out.println("El resultado de la operación es: " + suma);

        scanner.close();
    }

    }