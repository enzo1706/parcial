import java.util.Date;

public class LineaPrestamo {
    private Date fechaDevolucionEstimada;
    private Ejemplar ejemplar;

    public void setFechaDevolucionEstimada(Date fechaDevolucionEstimada) {
        this.fechaDevolucionEstimada = fechaDevolucionEstimada;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    // Getters opcionales
    public Date getFechaDevolucionEstimada() {
        return fechaDevolucionEstimada;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }
}
