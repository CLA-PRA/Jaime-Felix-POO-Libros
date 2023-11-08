package miPrincipal;

public abstract class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor
    public Libro(String titulo, String autor, int numeroPaginas)
    {
        setTitulo( titulo );
        setAutor( autor );
        setNumeroPaginas( numeroPaginas );
    }

    // Métodos set/get
    public void setTitulo( String titulo )
    {
        // No hay nada que validar
    }

    public void setAutor( String autor )
    {
        // No hay nada que validar
    }

    public void setNumeroPaginas( int numeroPaginas )
    {
        // El número de páginas no debe ser negativo
    }

    public String getTitulo()
    {
        return "";
    }

    public String getAutor()
    {
        return "";
    }

    public int getNumeroPaginas()
    {
        return 0;
    }

    // Métodos de instancia
    public abstract double precio();

    // Método toString()
    public String toString()
    {
        String resultado = String.format("");
        return resultado;
    }
}