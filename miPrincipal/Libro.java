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

    // Metodos set/get
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
        // El numero de paginas no debe ser negativo
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

    // Metodos de instancia
    public abstract double precio();

    // Metodo toString()
    public String toString()
    {
        String resultado = String.format("");
        return resultado;
    }
}