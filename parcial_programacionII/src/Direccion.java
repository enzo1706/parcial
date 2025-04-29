public class Direccion {
    private String calle;
    private int numero;
    private String ciudad;
    private String codigoCiudad;

    public Direccion(String calle, int numero, String ciudad, String codigoCiudad) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.codigoCiudad = codigoCiudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoCiudad() {
        return codigoCiudad;
    }

    public void setCodigoCiudad(String codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    @Override
    public String toString(){
        return " Direccion: { Calle: " + calle + " numero: " + numero + " Ciudad: " + ciudad + " Codigo ciudad: " + codigoCiudad + " }";
    }
}
