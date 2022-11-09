package cl.awakelab.models.services;

import cl.awakelab.models.entities.Contacto;
import cl.awakelab.models.repositories.IContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ContactoService {


    @Autowired
    private IContactoRepository contactoRepository;

    public ContactoService(IContactoRepository contactoRepository) {
        this.contactoRepository = contactoRepository;
    }

    public List<Contacto> getAll(){
        return contactoRepository.findAll();
    }
    public Optional<Contacto> getOne(Integer id){
        return contactoRepository.findById(id);
    }
    public void create(Contacto contacto){
        contactoRepository.save(contacto);
    }
    public void update(Contacto contacto){
        contactoRepository.save(contacto);
    }
    public void delete(Integer id){
        contactoRepository.deleteById(id);
    }
}


