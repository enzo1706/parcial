import java.util.List;

public abstract class Publicacion {
    protected String titulo;
    protected int anio;
    protected List<Ejemplar> ejemplares;
    protected Genero genero;

    public List<Ejemplar> getEjemplaresDisponibles() {
        return ejemplares.stream()
                .filter(Ejemplar::estaDisponible)
                .toList();
    }
}
