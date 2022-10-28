package cl.awakelab.models.DAO;

import cl.awakelab.models.Usuario;
import cl.awakelab.models.UsuarioRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UsuarioDaoImpl implements IUsuarioDao {
    @Autowired
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void create(Usuario usuario) {
        String sql = "insert into usuario (nombre, apellido, rut, tipo, fecha_nacimiento) values (?, ?, ?, ?, ?, ?)";
        template.update(sql,new Object[] {usuario.getNombre(), usuario.getApellido(), usuario.getRut(),
                usuario.getTipo(), usuario.getFechaNacimiento()});
    }

    @Override
    public List<Usuario> obtener() {
        String sql = "select * from id, nombre, apellido, rut, tipo, fecha_nacimiento";
        return template.query(sql, new UsuarioRowMapper());
    }

    @Override
    public void eliminar(int id) {
        String sql = "delete usuario where id = ?";
        template.update (sql, id);
    }

    @Override
    public Usuario readOne(Integer id) {
        String sql = "select id, nombre, apellido, rut, tipo, fecha_nacimiento" +
                "where id = ? ";
        return template.queryForObject(sql, new Object[] {id}, new UsuarioRowMapper());
    }
    @Override
    public void actualizar(Usuario usuario) {
        String sql = "update usuario set nombre = ?, apellido = ?, rut = ?, tipo = ?, fecha_nacimiento = ? ";
        template.update(sql, new Object[]{usuario.getNombre(),usuario.getApellido(), usuario.getRut(),usuario.getTipo(), usuario.getFechaNacimiento()
                });
    }

    /*private Connection connection;

    @Override
    public Usuario create(Usuario usuario) {
        String sql = "insert into usuario (nombre, apellido, rut, tipo, fechaNacimiento) values ('" + usuario.getNombre() + "', '"
                + usuario.getApellido() + "', '"
                + usuario.getFechaNacimiento() + "', '"
                + usuario.getRut() + "', '"
                + usuario.getTipo() + "')";
        try {
            connection = Conection.getConn();
            Statement statement = connection.createStatement();
            statement.execute(sql);
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

    @Override
    public List<Usuario> readAll() {
        String sql = "select id_usuario, nombre, apellido, fecha_nacimiento, rut, tipo from usuario";
        List<Usuario> usuarios = new ArrayList<>();
        try {
            connection = Conection.getConn();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                usuarios.add(new Usuario(resultSet.getInt("id_usuario"), resultSet.getString("nombre"),
                        resultSet.getString("apellido"),
                        resultSet.getInt("rut"), resultSet.getString("tipo"), resultSet.getString("fechaNacimiento")));
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    @Override
    public Usuario readOne(Long idUsuario) {
        String sql = "select id_usuario, nombre_completo, fecha_nacimiento, run, tipo from usuario where id_usuario = '" + idUsuario + "'";
        Usuario usuario = null;
        try {
            connection = Conection.getConn();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                usuario = new Usuario(resultSet.getInt("idUser"),
                        resultSet.getString("nombre"), resultSet.getString("apellido"),
                        resultSet.getInt("rut"), resultSet.getString("tipo"));
            }
            resultSet.close();
            statement.close();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return usuario;
    }

    @Override
    public void update(Usuario usuario) {
        String sql = "update usuario set nombre = '" + usuario.getNombre() + "', "
                + "apellido = '" + usuario.getApellido() + "', rut = '"
                + usuario.getRut() + "', tipo = '" + usuario.getTipo() + "' where id_usuario ='" + usuario.getIdUser() + "'";

        try{
            connection = Conection.getConn();
            Statement statement = connection.createStatement();
            statement.execute(sql);
            statement.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Long idUsuario) {
        String sql = "delete usuario where id_usuario = '" + idUsuario + "'";

        try{
            connection = Conection.getConn();
            Statement statement = connection.createStatement();
            statement.execute(sql);
            statement.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }*/
}
