package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Libro l1, l2;

    @BeforeAll public static void setUp() {
        l1 = new LibroFiccion("XYZ", "?", 500);
        l2 = new LibroProfesional("Cobol", "??", 500, 'R');
    }

    @Test public void testPrecio1() {
        assertTrue(l1.precio()==250.0);
    }

    @Test public void testPrecio2() {
        assertTrue(l2.precio()==500.0);
    }

    @Test public void testPaginas() {
        assertTrue(l1.getNumeroPaginas()==500);
    }

    @Test public void testPasta() {
        assertTrue(((LibroProfesional)l2).getTipoPasta()=='S');
    }
}