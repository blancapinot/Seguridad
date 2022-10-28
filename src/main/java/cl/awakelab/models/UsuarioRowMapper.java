package cl.awakelab.models;


import cl.awakelab.models.entities.Usuario;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioRowMapper implements RowMapper<Usuario> {

@Override
    public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {

    return new Usuario(rs.getString("nombre"),
            rs.getString("apellido"),
            rs.getInt("rut"),
            rs.getString("tipo"),
            rs.getString("fechaNacimiento"));
}


}
