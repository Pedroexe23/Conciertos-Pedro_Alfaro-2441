package cl.inacap.conciertos.DTO;

public class Concieto {
    private String Nombre;
    private String Musica;
    private String Fecha;
    private int calificacion;
    private int precio;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getMusica() {
        return Musica;
    }

    public void setMusica(String musica) {
        Musica = musica;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  Fecha +" "+Nombre + " " + precio +" "+ calificacion;
    }
}
