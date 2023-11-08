package miPrincipal;

public class LibroProfesional extends Libro {
    // Atributos
    private char tipoPasta;

    // Constructor
    public LibroProfesional(String titulo, String autor, int numeroPaginas, char tipoPasta)
    {
        super( titulo, autor, numeroPaginas );
        setTipoPasta( tipoPasta );
    }

    // Metodos set/get
    public void setTipoPasta( char tipoPasta )
    {
        // El tipo de pasta debe ser S o D
        // De no ser así asignar S
    }

    public char getTipoPasta()
    {
        return 0;
    }

    // Implementar metodos de instancia precio
    public double precio()
    {
        return 0.0;
    }

    // Metodo toString()
    public String toString()
    {
        String resultado = "Libro Profesional: " + super.toString() + String.format( "" );
        return resultado;
    }
}