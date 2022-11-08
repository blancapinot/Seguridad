package cl.awakelab.models.entities;

import javax.persistence.*;
@Entity
@Table(name = "usuario")
public class Usuario {
        @Id
        @Column(name = "id_usuario")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        protected Long idUsuario;
        @Column(name = "nombre_completo")
        protected String nombreCompleto;

        @Column(name = "fecha_nacimiento")
        protected String fechaNacimiento;
        protected Integer run;
        protected String tipo;

        public Usuario(){}

        public Usuario(String nombreCompleto, String fechaNacimiento, Integer run, String tipo) {
            this.nombreCompleto = nombreCompleto;
            this.fechaNacimiento = fechaNacimiento;
            this.run = run;
            this.tipo = tipo;
        }

        public Usuario(Long idUsuario, String nombreCompleto, String fechaNacimiento, Integer run, String tipo) {
            this.idUsuario = idUsuario;
            this.nombreCompleto = nombreCompleto;
            this.fechaNacimiento = fechaNacimiento;
            this.run = run;
            this.tipo = tipo;
        }

        public Long getIdUsuario() {
            return idUsuario;
        }

        public void setIdUsuario(Long idUsuario) {
            this.idUsuario = idUsuario;
        }

        public String getNombreCompleto() {
            return nombreCompleto;
        }

        public void setNombreCompleto(String nombreCompleto) {
            this.nombreCompleto = nombreCompleto;
        }

        public String getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }

        public Integer getRun() {
            return run;
        }

        public void setRun(Integer run) {
            this.run = run;
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
                    "nombreCompleto='" + nombreCompleto + '\'' +
                    ", fechaNacimiento='" + fechaNacimiento + '\'' +
                    ", run=" + run +
                    ", tipo='" + tipo + '\'' +
                    '}';
        }

        /*@Override
        public void analizarUsuario() {
            System.out.println("El nombre del usuario es " + this.nombreCompleto + ", y el run es: " + this.run);
        }*/
    }


