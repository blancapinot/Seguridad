package cl.awakelab.controllers;

import cl.awakelab.models.entities.Contacto;
import cl.awakelab.models.services.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;


@RequestMapping("/contacto")
@Controller
public class ContactoController {

    @Autowired
    private ContactoService contactoService;

    @RequestMapping(value = ("/agregar"), method = RequestMethod.GET)
    public ModelAndView agregarContacto(){
        ModelAndView model = new ModelAndView();
        Contacto contacto = new Contacto();
        model.addObject("contactoForm", contacto);
        model.setViewName("contacto");
        return model;
    }

    @RequestMapping(value = "/actualizar/{id}", method = RequestMethod.GET)
    public ModelAndView actualizarContacto(@PathVariable Integer id){
        ModelAndView model = new ModelAndView();
        Optional<Contacto> contacto = contactoService.getOne(id);
        model.addObject("contactoForm", contacto);
        model.setViewName("contacto");
        return model;
    }
    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public ModelAndView actualizarFormContacto(@ModelAttribute("contactoForm") Contacto contacto){
        if(contacto.getIdContacto() != null){
            contactoService.update(contacto);
        } else {
            contactoService.create(contacto);
        }
        return  new ModelAndView("redirect:/");
    }

}
