package cl.awakelab.models.Dao;

import Models.Capacitacion;

import java.util.List;

public interface ICapacitacionDao {
    public boolean create (Capacitacion capacitacion);
    public List<Capacitacion> obtener();
    public boolean actualizar(Capacitacion capacitacion);
    public boolean eliminar(int id);


}
