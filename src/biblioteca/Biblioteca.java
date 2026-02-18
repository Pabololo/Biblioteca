package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona una coleccion de libros.
 *
 * @author Nombre del estudiante
 * @version 1.0
 */
public class Biblioteca {

    private String nombre;
    private List<Libro> libros;

    /**
     * Constructor de la biblioteca.
     *
     * @param nombre Nombre de la biblioteca
     */
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    /**
     * Agrega un libro a la biblioteca.
     *
     * @param libro Libro a agregar
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Busca un libro por su ISBN.
     *
     * @param isbn ISBN del libro a buscar
     * @return El libro encontrado o null si no existe
     */
    public Libro buscarPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Cuenta los libros disponibles.
     *
     * @return Numero de libros disponibles
     */
    public int contarDisponibles() {
        int count = 0;
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                count++;
            }
        }
        return count;
    }

    /**
     * Obtiene el total de libros.
     *
     * @return Total de libros en la biblioteca
     */
    public int getTotalLibros() {
        return libros.size();
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Muestra todos los libros de la biblioteca.
     */
    public void mostrarLibros() {
        System.out.println("=== " + nombre + " ===");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
        System.out.println("Total: " + getTotalLibros() + " | Disponibles: " + contarDisponibles());
    }
}

