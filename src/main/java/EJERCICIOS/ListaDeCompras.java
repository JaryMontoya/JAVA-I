package EJERCICIOS;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();

        int opcion;
        do {
            System.out.println("----- Lista de Compras -----");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Eliminar elemento");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarElemento(listaDeCompras, scanner);
                    break;
                case 2:
                    mostrarLista(listaDeCompras);
                    break;
                case 3:
                    eliminarElemento(listaDeCompras, scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 4);

        scanner.close();
    }

    private static void agregarElemento(ArrayList<String> listaDeCompras, Scanner scanner) {
        System.out.print("Ingresa el elemento a agregar: ");
        String elemento = scanner.next();
        listaDeCompras.add(elemento);
        System.out.println("Elemento '" + elemento + "' agregado a la lista.");
    }

    private static void mostrarLista(ArrayList<String> listaDeCompras) {
        if (listaDeCompras.isEmpty()) {
            System.out.println("La lista de compras está vacía.");
        } else {
            System.out.println("----- Lista de Compras -----");
            for (int i = 0; i < listaDeCompras.size(); i++) {
                System.out.println((i + 1) + ". " + listaDeCompras.get(i));
            }
        }
    }

    private static void eliminarElemento(ArrayList<String> listaDeCompras, Scanner scanner) {
        mostrarLista(listaDeCompras);

        if (!listaDeCompras.isEmpty()) {
            System.out.print("Ingresa el número del elemento a eliminar: ");
            int indice = scanner.nextInt();

            if (indice >= 1 && indice <= listaDeCompras.size()) {
                String elementoEliminado = listaDeCompras.remove(indice - 1);
                System.out.println("Elemento '" + elementoEliminado + "' eliminado de la lista.");
            } else {
                System.out.println("Número de elemento no válido. No se eliminó nada.");
            }
        }
    }
}
