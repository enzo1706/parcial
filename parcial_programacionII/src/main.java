import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Direccion direccion = new Direccion("Av. San Martin", 123, "Mendoza", "1234");
        Editorial editorial = new Editorial("MisLibros", "https://mislibros.com", direccion);


        Genero genero = new Genero("Ficción", "Narraciones imaginarias");


        Autor autor1 = new Autor("Franco Mastantuono", "Colombiano", LocalDate.of(1927, 3, 6));
        Autor autor2 = new Autor("Miguel Borja", "Chilena", LocalDate.of(1942, 8, 2));
        ArrayList<Autor> autores = Arrays.asList(autor1, autor2);


        Libro libro = new Libro("978-3-16-148410-0", 1986, , genero, editorial, autores);
        Ejemplar ejemplar1 = new Ejemplar("E001", EstadoEjemplar.DISPONIBLE, libro);
        Ejemplar ejemplar2 = new Ejemplar("E002", EstadoEjemplar.DISPONIBLE, libro);
        libro.getEjemplares().addAll(Arrays.asList(ejemplar1, ejemplar2));


        Revista revista = new Revista("Revista Ciencia Hoy", 2025, genero, 12, 3);
        Ejemplar ejemplarRevista = new Ejemplar("G564", EstadoEjemplar.DISPONIBLE, revista);
        revista.getEjemplares().add(ejemplarRevista);


        Biblioteca biblioteca = new Biblioteca();
        biblioteca.getPublicaciones().addAll(Arrays.asList(libro, revista));


        Usuario usuario = new Usuario("Roberto", "Lopez", "45345678");
        Prestamo prestamo = new Prestamo(LocalDate.now(), LocalDate.now().plusDays(14));
        prestamo.agregarLineaPrestamo(ejemplar1);
        usuario.getPrestamos().add(prestamo);
        biblioteca.getUsuarios().add(usuario);
    }
}

