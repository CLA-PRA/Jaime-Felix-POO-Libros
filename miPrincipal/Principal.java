package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        System.out.println("Libros");
        System.out.println("======");

        System.out.println();

        // Libro de Ficción
        System.out.println("Libro de Ficción:");
        System.out.print("Proporcione el titulo del libro:");
        System.out.print("Proporcione el autor del libro:");
        System.out.print("Proporcione el número de páginas del libro:");

        // Crear LibroFiccion
        Libro l1 = new LibroFiccion( titulo, autor, numeroPaginas );

        entrada.nextLine();     // Eliminar <Enter> pendiente

        // Libro Profesional

        // Crear LibroProfesional
        Libro l2 = new LibroProfesional( titulo, autor, numeroPaginas, tipoPasta );

        // Mostrar los datos de los libros
        System.out.println();

        entrada.close();
    }
}