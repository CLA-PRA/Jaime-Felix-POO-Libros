package miPrincipal;

public class LibroFiccion extends Libro {
    // Constructor
    public LibroFiccion(String titulo, String autor, int numeroPaginas)
    {
        super( titulo, autor, numeroPaginas );
    }

    // Implementar métodos de instancia precio
    public double precio()
    {
        return 0.0;
    }

    // Método toString()
    public String toString()
    {
        String resultado = "Libro Ficcion: " + super.toString() + String.format( "" );
        return resultado;
    }
}