package cl.awakelab.models.services;

import cl.awakelab.models.entities.Capacitacion;
import cl.awakelab.models.repositories.ICapacitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CapacitacionService {


    @Autowired
    private ICapacitacionRepository capacitacionRepository;

    public CapacitacionService(ICapacitacionRepository capacitacionRepository) {
        this.capacitacionRepository = capacitacionRepository;
    }

    public List<Capacitacion> getAll(){
        return capacitacionRepository.findAll();
    }
    public Optional<Capacitacion> getOne(Integer id){
          return capacitacionRepository.findById(id);
    }
    public void create(Capacitacion capacitacion){
        capacitacionRepository.save(capacitacion);
    }
    public void update(Capacitacion capacitacion){
        capacitacionRepository.save(capacitacion);
    }
    public void delete(Integer id){
        capacitacionRepository.deleteById(id);
    }
}
