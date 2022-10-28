package cl.awakelab.models.service;

import cl.awakelab.models.entities.Capacitacion;
import cl.awakelab.models.DAO.CapacitacionDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CapacitacionService {


    @Autowired
    private CapacitacionDaoImpl cDao;
    
    public CapacitacionService(CapacitacionDaoImpl cDao) {
        this.cDao = cDao;
    }

    public List<Capacitacion> getAll(){
        return cDao.obtener();
    }
    public Capacitacion getOne(Integer id){
        return  cDao.readOne(id);
    }
    public void create(Capacitacion capacitacion){
        cDao.create(capacitacion);
    }
    public void update(Capacitacion capacitacion){
        cDao.actualizar(capacitacion);
    }
    public void delete(int id){
        cDao.eliminar(id);
    }
}
