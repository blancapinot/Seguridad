package cl.awakelab.models.DAO;

import cl.awakelab.models.Capacitacion;

import java.util.List;

public interface ICapacitacionDao {
    public void create (Capacitacion capacitacion);
    public List<Capacitacion> obtener();
public Capacitacion readOne (Integer id);
    public void actualizar(Capacitacion capacitacion);
    public void eliminar(int id);


}
