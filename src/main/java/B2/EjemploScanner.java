package B2;

import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre
        System.out.print("Ingrese su nombre: ");

        // Leer la entrada del usuario como una cadena (String)
        String nombre = scanner.nextLine();

        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");

        // Leer la entrada del usuario como un entero (int)
        int edad = scanner.nextInt();

        // Mostrar la información ingresada por el usuario
        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");

        // Cerrar el escáner para liberar recursos
        scanner.close();
    }
}
