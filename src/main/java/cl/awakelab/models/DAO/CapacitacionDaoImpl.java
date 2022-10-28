package cl.awakelab.models.DAO;

import cl.awakelab.models.Capacitacion;
import cl.awakelab.models.CapacitacionRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


public class CapacitacionDaoImpl implements ICapacitacionDao {
    @Autowired
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }


    @Override
    public void create(Capacitacion capacitacion) {
        String sql = "insert into capacitaciones (rut_cliente, dia, hora, lugar, duracion, cantidad_asistentes) values (?, ?, ?, ?, ?, ?)";
        template.update(sql,new Object[] {capacitacion.getRutCliente(), capacitacion.getDia(), capacitacion.getHora(),
                capacitacion.getLugar(), capacitacion.getDuracion(), capacitacion.getCantidadDeAsistentes()});
    }

    @Override
    public List<Capacitacion> obtener() {
        String slq = "select id_capacitacion, rut_cliente, dia, hora, lugar, duracion, cantidad_asistentes from capacitaciones";
        return template.query(slq,new CapacitacionRowMapper());
    }

    @Override
    public Capacitacion readOne(Integer id) {
        String sql = "select id_capacitacion, rut_cliente, dia, hora, lugar, duracion, cantidad_asistentes " +
                "where id_capacitacion = ? ";
        return template.queryForObject(sql, new Object[] {id}, new CapacitacionRowMapper());
    }

    @Override
    public void actualizar(Capacitacion capacitacion) {
    String sql = "update capacitaciones set rut_cliente = ?, dia = ?, hora = ?, lugar = ?, duracion = ?, cantidad_asistentes = ?";
    template.update(sql, new Object[]{capacitacion.getRutCliente(),capacitacion.getDia(), capacitacion.getHora(),capacitacion.getLugar(),
    capacitacion.getDuracion(),capacitacion.getCantidadDeAsistentes()});
    }

    @Override
    public void eliminar(int id) {
    String sql = "delete capacitaciones where id_capacitacion = ?";
    template.update (sql, id);
    }
}


   /* private Connection conn = null;

    @Override
    public boolean create(Capacitacion capacitacion) {
        boolean crear = false;
        Statement stm = null;
        Connection conn = null;
        String sqlCapacitacion = "insert into capacitaciones (cantidad_asistentes, rut_cliente, dia, hora, lugar, duracion) values ('" +
                capacitacion.getCantidadDeAsistentes() + "', '" +
                capacitacion.getRutCliente() + "', '" +
                capacitacion.getDia() + "', '" +
                capacitacion.getHora() + "', '" +
                capacitacion.getLugar() + "', '" +
                capacitacion.getDuracion() + "')";

        try {
            conn = Conection.getConn();
            stm = conn.createStatement();
            stm.execute(sqlCapacitacion);

            crear = true;
            stm.close();
        } catch (SQLException e) {
            System.out.println("Error: " + "Clase CapacitacionDaoImpl, " + "Método Registrar");
            e.printStackTrace();
        }
        return crear;
    }

    @Override
    public List<Capacitacion> obtener() {
        String sql = "SELECT * FROM capacitaciones";
        List<Capacitacion> listaCapacitacion = new ArrayList<>();
        try {
            conn = Conection.getConn();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                listaCapacitacion.add(new Capacitacion(rs.getInt("rut_cliente"),
                        rs.getString("dia"),
                        rs.getString("hora"),                  //Importante !!!
                        rs.getString("lugar"),              //lo que lleva dentro de la columna debe ser
                        rs.getInt("id_capacitacion"),       //igual a al nombre de la columna en la base de datos
                        rs.getString("duracion"),
                        rs.getInt("cantidad_asistentes")));
            }
            rs.close();
            stm.close();
        } catch (SQLException e) {
            System.out.println("Error: " + "Clase CapacitacionDaoImpl, " + "Método Obtener");
            e.printStackTrace();
        }

        return listaCapacitacion;
    }

    @Override
    public boolean actualizar(Capacitacion capacitacion) {
        Connection conn = null;
        Statement stm = null;
        boolean actualizar = false;

        String sql = "update capacitaciones set rut_cliente = '" + capacitacion.getRutCliente() + "', '"
                + "dia = '" + capacitacion.getDia() + "', hora = '"
                + capacitacion.getHora() + "', lugar = '" + capacitacion.getLugar()
                + "', duracion = '" + capacitacion.getDuracion()
                + "', cantidad_asistentes = '" + capacitacion.getCantidadDeAsistentes() + "' where id_capacitacion ='" + capacitacion.getId() + "'";

        try {
            conn = Conection.getConn();
            stm = conn.createStatement();
            stm.execute(sql);
            actualizar = true;
            stm.close();
        } catch (SQLException e) {
            System.out.println("Error: " + "Clase CapacitacionDaoImpl, " + "Método Actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean eliminar(int id) {
        Statement stm = null;
        boolean eliminar = false;
        String sql = "DELETE FROM capacitaciones WHERE id_capacitacion = '" + id + "' ";
        try {
            conn = Conection.getConn();
            stm = conn.createStatement();
            stm.execute(sql);
            stm.close();
            eliminar = true;


        } catch (SQLException e) {
            System.out.println("Error: " + "Clase CapacitacionDaoImpl, " + "Método Eliminar");
            e.printStackTrace();

        }
        return eliminar;
    */





