import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Publicacion> publicaciones;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.publicaciones = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }


    public void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }


    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }


    public void mostrarInformacion() {
        System.out.println("Publicaciones en la biblioteca:");
        for (Publicacion pub : publicaciones) {
            System.out.println(pub);
        }

        System.out.println("\nUsuarios registrados:");
        for (Usuario usr : usuarios) {
            System.out.println(usr);
        }
    }
}
