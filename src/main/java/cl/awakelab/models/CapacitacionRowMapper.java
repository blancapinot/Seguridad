package cl.awakelab.models;

import cl.awakelab.models.entities.Capacitacion;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CapacitacionRowMapper implements RowMapper <Capacitacion> {

    @Override
    public Capacitacion mapRow(ResultSet rs, int rowNum) throws SQLException {

        return new Capacitacion(rs.getInt("rut_cliente"), rs.getString("dia"), rs.getString("hora"), rs.getString("lugar"), rs.getInt("id_capacitacion"), rs.getString("duracion"), rs.getInt("cantidad_asistentes"));
    }
}
