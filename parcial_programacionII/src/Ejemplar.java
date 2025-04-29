public class Ejemplar {
    private boolean disponible;

    public Ejemplar(boolean disponible) {
        this.disponible = disponible;
    }


    public boolean estaDisponible() {
        return disponible;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "disponible=" + disponible +
                '}';
    }
}