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
    public String toString(){
        String conclusion = new String();
        if (calificacion==1){
            conclusion=Fecha+" "+Nombre+" "+precio+" "+calificacion+" "+"esto es una estafa";
        }else if (calificacion==2){
            conclusion=Fecha+" "+Nombre+" "+precio+" "+calificacion+" "+"apesta";
        }else if (calificacion==3){
            conclusion=Fecha+" "+Nombre+" "+precio+" "+calificacion+" "+"Aburrido";
        }else if (calificacion==4){
            conclusion=Fecha+" "+Nombre+" "+precio+" "+calificacion+" "+"Hay mejores";
        }else if (calificacion==5){
            conclusion=Fecha+" "+Nombre+" "+precio+" "+calificacion+" "+"Bien";
        }else if (calificacion==6){
            conclusion=Fecha+" "+Nombre+" "+precio+" "+calificacion+" "+"Increible";
        }else {
            conclusion=Fecha+" "+Nombre+" "+precio+" "+calificacion+" "+"Exelente";
        }
        //return Fecha+""+Nombre+""+precio+""+calificacion;
        return conclusion;
    }
}
