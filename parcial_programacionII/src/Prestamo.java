import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private List<LineaPrestamo> lineas;

    public Prestamo(Date fechaPrestamo, Date fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.lineas = new ArrayList<>();
    }

    public void agregarLineaPrestamo(Ejemplar ejemplar) {
        LineaPrestamo linea = new LineaPrestamo();
        linea.setEjemplar(ejemplar);

        // Establecer fecha estimada de devolución, por ejemplo, 15 días desde hoy
        long milisegundos15Dias = 15L * 24 * 60 * 60 * 1000;
        Date fechaEstimada = new Date(System.currentTimeMillis() + milisegundos15Dias);
        linea.setFechaDevolucionEstimada(fechaEstimada);

        lineas.add(linea);
    }

}
