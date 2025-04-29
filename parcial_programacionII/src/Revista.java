import java.util.List;

public class Revista extends Publicacion {
    private int volumen;
    private int numero;

    public Revista(String titulo, int anio, List<Ejemplar> ejemplares, Genero genero, int volumen, int numero) {
        this.titulo = titulo;
        this.anio = anio;
        this.ejemplares = ejemplares;
        this.genero = genero;
        this.volumen = volumen;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "titulo='" + titulo + '\'' +
                ", anio=" + anio +
                ", volumen=" + volumen +
                ", numero=" + numero +
                '}';
    }
}