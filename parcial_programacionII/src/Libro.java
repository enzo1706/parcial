import java.util.List;

public class Libro extends Publicacion {
    private String isbn;
    private List<Autor> autores;
    private Editorial editorial;

    public Libro(String titulo, int anio, List<Ejemplar> ejemplares, Genero genero, String isbn,
                 List<Autor> autores, Editorial editorial) {
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.genero = genero;
        this.isbn = isbn;
        this.autores = autores;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", anio=" + anio +
                ", isbn='" + isbn + '\'' +
                ", autores=" + autores +
                ", editorial=" + editorial +
                '}';
    }

}
