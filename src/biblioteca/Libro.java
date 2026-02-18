package biblioteca;

/**
 * Clase que representa un libro en la biblioteca.
 *
 * @author Nombre del estudiante
 * @version 1.0
 */
public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private boolean disponible;

    /**
     * Constructor del libro.
     *
     * @param isbn Codigo ISBN del libro
     * @param titulo Titulo del libro
     * @param autor Autor del libro
     */
    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    // Getters y Setters

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * Presta el libro si esta disponible.
     *
     * @return true si se pudo prestar, false si ya estaba prestado
     */
    public boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }
    //.

    /**
     * Devuelve el libro.
     */
    public void devolver() {
        disponible = true;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo + " (" + autor + ") - " + (disponible ? "Disponible" : "Prestado");
    }
}

