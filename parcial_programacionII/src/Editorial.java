public class Editorial {
    private String nombre;
    private String sitioweb;
    private Direccion direccion;

    public Editorial(String nombre, String sitioweb, Direccion direccion) {
        this.nombre = nombre;
        this.sitioweb = sitioweb;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSitioweb() {
        return sitioweb;
    }

    public void setSitioweb(String sitioweb) {
        this.sitioweb = sitioweb;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString(){
        return " Editorial: { nombre: " + nombre + " sitio web: " + sitioweb + " direccion: " + direccion;
    }
}
