package cl.awakelab.models;



public class Cliente extends Usuario {
    //Declaracion de atributos
    private String telefono;
    private String afp;
    private String sistemaDeSalud;
    private String comuna;
    private int edad;
    private String direccion;

    //metodo contructor sin parametros
    public Cliente() {
    }
    //metodo constructor con parametros


    public Cliente(Integer idUser, String nombre, String apellido, Integer rut, String tipo, String fechaNacimiento, String telefono, String afp, String sistemaDeSalud, String comuna, int edad, String direccion) {
        super(idUser, nombre, apellido, rut, tipo, fechaNacimiento);
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaDeSalud = sistemaDeSalud;
        this.comuna = comuna;
        this.edad = edad;
        this.direccion = direccion;
    }

    //generacion de metodo setter and getter
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        do {
            System.out.println("Ingrese su telefono de contacto");
            telefono = in.nextLine();
        } while (telefono.length() < 8);
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        do {
            System.out.println("Ingrese su AFP");
            afp = in.nextLine();
        } while (afp.length() < 3 || afp.length() > 30);
        this.afp = afp;
    }

    public String getSistemaDeSalud() {
        return sistemaDeSalud;
    }

    public void setSistemaDeSalud(String sistemaDeSalud) {
        int validacion;
        do {
            System.out.println("Seleccione su sistema de salud");
            System.out.println("Ingrese el numero [1] para Fonasa");
            System.out.println("Ingrese el numero [2] para Isapre");
            sistemaDeSalud = in.nextLine();
            if (sistemaDeSalud.equals("1") || sistemaDeSalud.equals("2")) {
                validacion = 1;
            } else {
                validacion = 0;
            }
        } while (validacion == 0);
        this.sistemaDeSalud = sistemaDeSalud;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        do {
            System.out.println("Ingrese su comuna");
            comuna = in.nextLine();
        } while (comuna.length() > 50 || comuna.isEmpty());

        this.comuna = comuna;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        do {
            System.out.println("Ingrese su edad");
            edad = in.nextInt();
        } while (edad <= 0 || edad > 150);
        this.edad = edad;
        in.nextLine();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        do {
            System.out.println("Ingrese su direccion");
            direccion = in.nextLine();
        } while (direccion.length() > 50 || direccion.isEmpty());
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "telefono='" + telefono + '\'' +
                ", afp='" + afp + '\'' +
                ", sistemaDeSalud='" + sistemaDeSalud + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", idUser=" + idUser +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", rut=" + rut +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                "} " + super.toString();
    }

    //Creacion metodo nombreCompleto

    public String nombreCompleto() {
        String nombreApellido = getNombre() + " " + getApellido();
        return nombreApellido;
    }

    // Creacion del metodo obtenerSistemaSalud():

    public String obtenerSistemaSalud() {
        if (sistemaDeSalud == "1") {
            sistemaDeSalud = "fonasa";
        } else if (sistemaDeSalud.equals("2")) {
            sistemaDeSalud = "isapre";
        }
        return sistemaDeSalud;
    }

    //Se implementa el metodo analizarUsuario de la clase padre Usuario
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Telefono: " + telefono + " Afp: " + afp + " Sistema de salud: " + sistemaDeSalud + "\n" +
                "Comuna: " + comuna + " Edad: " + edad + " Direccion: " + direccion);
    }
}
