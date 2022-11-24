package cl.awakelab.controllers;

import cl.awakelab.models.entities.Contacto;
import cl.awakelab.models.services.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RestContactoController {
    @Autowired
    private ContactoService contactoService;

    @GetMapping(value = "/api/list", headers = "Accept=application/json")
    public List<Contacto> readAll() {
        return contactoService.getAll();
    }

    @PostMapping(value = "/api/create", headers = "Accept=application/json")
    public void create(@RequestBody Contacto contacto) {
        contactoService.create(contacto);
    }

    @GetMapping(value = "/api/readOne/{id}")
    public Optional<Contacto> readOne(@PathVariable("id") Integer idContacto) {
        return contactoService.getOne(idContacto);
    }

    @PutMapping(value = "/api/update")
    public void update(@RequestBody Contacto contacto) {
        contactoService.update(contacto);
    }

    @DeleteMapping(value = "/api/delete/{id}")
    public void delete(@PathVariable("id") Integer idContacto) {
        contactoService.delete(idContacto);
    }
}
