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


    @RequestMapping(value = ("/listacontacto"), method = RequestMethod.GET) //Muestra la lista de capacitaciones
    public ModelAndView listarContacto(){
        ModelAndView model = new ModelAndView();
        List<Contacto> contacto = contactoService.getAll();
        model.addObject("Contacto", contacto);
        model.setViewName("listarContacto");
        return model;
    }

    @RequestMapping(value = ("/agregar"), method = RequestMethod.GET) //no se ocupa
    public ModelAndView agregarContacto(){
        ModelAndView model = new ModelAndView();
        Contacto contacto = new Contacto();
        model.addObject("contactoForm", contacto);
        model.setViewName("contacto");
        return model;
    }

    @RequestMapping(value = "/guardar/{id}", method = RequestMethod.GET) // get que otiene le id para actualizar.
    public ModelAndView actualizarContacto(@PathVariable Integer id){
        ModelAndView model = new ModelAndView();
        Optional<Contacto> contacto = contactoService.getOne(id);
        model.addObject("contactoForm", contacto);
        model.setViewName("contacto");
        return model;
    }
    @RequestMapping(value = "/guardar/{id}", method = RequestMethod.POST)//guarda capacitacion actualizada segun ID
    public ModelAndView actualizarFormContacto(@ModelAttribute("contactoForm") Contacto contacto){
        if(contactoService.getOne(contacto.getIdContacto()) != null){
            contactoService.update(contacto);
        } else {
            contactoService.create(contacto);
        }
        return  new ModelAndView("redirect:/contacto/lista");
    }


    @RequestMapping(value = "/guardar", method = RequestMethod.GET) //obtiene el formualrio para crear una nueva capacitacion
    public ModelAndView mostrarFormContacto() {
        ModelAndView model = new ModelAndView();
        Contacto contacto = new Contacto();
        model.addObject("contactoForm", contacto);
        model.setViewName("contacto");
        return model;
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)//guarda la nueva capacitacion
    public ModelAndView guardarOEditarFormContacto(@ModelAttribute("contactoForm") Contacto contacto){
        if(contactoService.getOne(contacto.getIdContacto()) != null){
            contactoService.update(contacto);
        } else {
            contactoService.create(contacto);
        }
        return  new ModelAndView("redirect:/contacto/lista");
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.GET)
    public ModelAndView eliminarContacto(@PathVariable("id") Integer id){
        contactoService.delete(id);
        System.out.println(id);
        return new ModelAndView("redirect:/contacto/lista");
    }


}
