package biblioteca;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {
    
    private Biblioteca biblioteca;
    
    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca("Test");
        biblioteca.agregarLibro(new Libro("001", "Libro1", "Autor1"));
        biblioteca.agregarLibro(new Libro("002", "Libro2", "Autor2"));
    }
    
    @Test
    void testAgregarLibro() {
        assertEquals(2, biblioteca.getTotalLibros());
    }
    
    @Test
    void testBuscarLibroExistente() {
        Libro libro = biblioteca.buscarPorIsbn("001");
        assertNotNull(libro);
        assertEquals("Libro1", libro.getTitulo());
    }
    
    @Test
    void testBuscarLibroInexistente() {
        Libro libro = biblioteca.buscarPorIsbn("999");
        assertNull(libro);
    }
    
    @Test
    void testContarDisponibles() {
        biblioteca.buscarPorIsbn("001").prestar();
        assertEquals(1, biblioteca.contarDisponibles());
    }
}