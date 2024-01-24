package EJERCICIOS;

import java.util.Scanner;

public class JuegoDeAdivinanza {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Juego de Adivinanzas!");
        System.out.println("¡Intenta adivinar un número del 1 al 100!");

        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intentos = 0;
        boolean adivinado = false;

        do {
            System.out.print("Ingresa tu suposición: ");
            int suposicion = scanner.nextInt();
            intentos++;

            if (suposicion == numeroSecreto) {
                adivinado = true;
            } else if (suposicion < numeroSecreto) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else {
                System.out.println("El número es menor. Intenta de nuevo.");
            }
        } while (!adivinado);

        System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
        scanner.close();
    }
}
