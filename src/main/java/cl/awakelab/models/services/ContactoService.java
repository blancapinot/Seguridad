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

    public List<Contacto> getAll(){
        return contactoRepository.findAll();
    }
    public void create(Contacto contacto){
        contactoRepository.save(contacto);
    }
    public Optional<Contacto> getOne(Integer idContacto){
        return contactoRepository.findById(idContacto);
    }

    public void update(Contacto contacto){
        contactoRepository.save(contacto);
    }
    public void delete(Integer idContacto){
        contactoRepository.deleteById(idContacto);
    }
}


