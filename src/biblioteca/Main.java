package biblioteca;

/**
 * Clase principal para probar el sistema.
 */
public class Main {

    public static void main(String[] args) {
        // Crear biblioteca
        Biblioteca biblio = new Biblioteca("Biblioteca Municipal");

        // Agregar libros
        biblio.agregarLibro(new Libro("001", "Don Quijote", "Cervantes"));
        biblio.agregarLibro(new Libro("002", "1984", "Orwell"));
        biblio.agregarLibro(new Libro("003", "El Principito", "Saint-Exupery"));

        // Mostrar libros
        biblio.mostrarLibros();

        // Prestar un libro
        System.out.println("\n--- Prestando libro ---");
        Libro libro = biblio.buscarPorIsbn("001");
        if (libro != null && libro.prestar()) {
            System.out.println("Libro prestado: " + libro.getTitulo());
        }

        // Mostrar estado actual
        System.out.println();
        biblio.mostrarLibros();

        // Devolver libro
        System.out.println("\n--- Devolviendo libro ---");
        libro.devolver();
        System.out.println("Libro devuelto: " + libro.getTitulo());

        System.out.println();
        biblio.mostrarLibros();
    }
}

