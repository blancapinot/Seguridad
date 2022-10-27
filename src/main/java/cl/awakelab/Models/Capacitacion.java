package cl.awakelab.Models;

public class Capacitacion extends Evento {
    int id;
    String duracion;
    int cantidadDeAsistentes;

    //Se genera constructor sin parametro
    public Capacitacion() {
    }

    public Capacitacion(int rutCliente, String dia, String hora, String lugar, int id, String duracion, int cantidadDeAsistentes) {
        super(rutCliente, dia, hora, lugar);
        this.id = id;
        this.duracion = duracion;
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    public Capacitacion(int rutCliente, String dia, String hora, String lugar, String duracion, int cantidadDeAsistentes) {
        super(rutCliente, dia, hora, lugar);
        this.duracion = duracion;
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    public Capacitacion(int id) {
    }

    //Getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getCantidadDeAsistentes() {
        return cantidadDeAsistentes;
    }

    public void setCantidadDeAsistentes(int cantidadDeAsistentes) {
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    //to Strings
    @Override
    public String toString() {
        return "Capacitacion{" +
                "id=" + id +
                ", duracion='" + duracion + '\'' +
                ", cantidadDeAsistentes=" + cantidadDeAsistentes +
                "} " + super.toString();
    }

    //Creacion de metodo mostrarDetalle()
    public String mostrarDetalle() {
        String detalle = "La capacitacion sera en: " + getLugar() + " a las " + getHora() + " del dia " + getDia() + " y durara " + duracion;
        return detalle;
    }
}
