package cl.awakelab.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @Column(name = "id_usuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer idUsuario;

    protected String nombre;

    protected String apellido;

    @Column(name = "fecha_nacimiento")
    protected String fechaNacimiento;
    protected Integer rut;
    protected String tipo;

    public Usuario() {
    }

    //Constructor sin ID
    public Usuario(String nombre, String apellido, String fechaNacimiento, Integer rut, String tipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
        this.tipo = tipo;
    }

    //Constructor con ID


    public Usuario(Integer idUsuario, String nombre, String apellido, String fechaNacimiento, Integer rut, String tipo) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.rut = rut;
        this.tipo = tipo;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", rut=" + rut +
                ", tipo='" + tipo + '\'' +
                '}';
    }

  /*@Override
        public void analizarUsuario() {
            System.out.println("El nombre del usuario es " + this.nombreCompleto + ", y el run es: " + this.run);
        }*/
}


