package biblioteca;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class LibroTest {
    
    private Libro libro;
    
    @BeforeEach
    void setUp() {
        libro = new Libro("001", "Test", "Autor");
    }
    
    @Test
    void testLibroInicialmenteDisponible() {
        assertTrue(libro.isDisponible());
    }
    
    @Test
    void testPrestarLibroDisponible() {
        boolean resultado = libro.prestar();
        assertTrue(resultado);
        assertFalse(libro.isDisponible());
    }
    
    @Test
    void testPrestarLibroYaPrestado() {
        libro.prestar();
        boolean resultado = libro.prestar();
        assertFalse(resultado);
    }
    
    @Test
    void testDevolverLibro() {
        libro.prestar();
        libro.devolver();
        assertTrue(libro.isDisponible());
    }
}