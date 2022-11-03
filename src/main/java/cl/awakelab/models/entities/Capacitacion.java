package cl.awakelab.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "capacitaciones")
public class Capacitacion {
    @Column(name = "rut_cliente")
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    @Id
    @Column(name = "id_capacitacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String duracion;
    @Column(name = "cantidad_asistentes")
    int cantidadDeAsistentes;

    public Capacitacion() {

    }

    //Constructor completo
    public Capacitacion(int rutCliente, String dia, String hora, String lugar, int id, String duracion, int cantidadDeAsistentes) {
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.id = id;
        this.duracion = duracion;
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    // Constructor sin ID
    public Capacitacion(int rutCliente, String dia, String hora, String lugar, String duracion, int cantidadDeAsistentes) {
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadDeAsistentes = cantidadDeAsistentes;
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

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    //to Strings

    @Override
    public String toString() {
        return "Capacitacion{" +
                "rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", id=" + id +
                ", duracion='" + duracion + '\'' +
                ", cantidadDeAsistentes=" + cantidadDeAsistentes +
                '}';
    }

    //Creacion de metodo mostrarDetalle()
    public String mostrarDetalle() {
        String detalle = "La capacitacion sera en: " + getLugar() + " a las " + getHora() + " del dia " + getDia() + " y durara " + duracion;
        return detalle;
    }
}
