package cl.awakelab.models.entities;

import javax.persistence.*;

@Entity
@Table (name = "contacto")
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_contacto")
    private Integer idContacto;

    private String nombre;

    private String apellido;

    private String direccion;

    private String consulta;

    private String ciudad;

    public Contacto() {
    }

    public Contacto(String nombre, String apellido, String direccion, String consulta, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.consulta = consulta;
        this.ciudad = ciudad;
    }

    public Contacto(Integer idContacto, String nombre, String apellido, String direccion, String consulta, String ciudad) {
        this.idContacto = idContacto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.consulta = consulta;
        this.ciudad = ciudad;
    }

    public Integer getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(Integer idContacto) {
        this.idContacto = idContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "idContacto=" + idContacto +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", consulta='" + consulta + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}

