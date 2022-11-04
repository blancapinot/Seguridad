package cl.awakelab.controllers;

import cl.awakelab.models.entities.Capacitacion;
import cl.awakelab.models.services.CapacitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class EditarCapacitacionController {

    @Autowired
    private CapacitacionService capacitacionService;

    /**
     * Maneja las solicitudes que se le hacen a la raíz del sitio
     *
     * @return un objeto {@link ModelAndView} con la respuesta al cliente
     */
   /* @RequestMapping(path = "/editar-capacitacion", method = RequestMethod.GET)
    public ModelAndView miEditarCapacitacion() {
        return new ModelAndView("editarCapacitacion");*/
    }
/*
    @RequestMapping(value = "/editar-capacitacion", method = RequestMethod.POST)
    public ModelAndView editar(@ModelAttribute("capacitacion") Capacitacion capacitacion) {
        capacitacionService.update(capacitacion);

        return new ModelAndView("listarCapacitacion");
    }*/


    @RequestMapping(value = "/editar-capacitacion/{id}", method = RequestMethod.GET)
    public ModelAndView actualizarCapacitacion(@PathVariable Integer id){
        ModelAndView model = new ModelAndView();
        Capacitacion capacitacion = capacitacionService.getOne(id);
        model.addObject("capacitacion", capacitacion);
        model.setViewName("crearUsuario");
        return model;
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public ModelAndView guardarOEditarUsuario(@ModelAttribute("usuarioForm") Usuario usuario){
        if(usuario.getIdUsuario() != null){
            usuarioService.update(usuario);
        } else {
            usuarioService.create(usuario);
        }
        return  new ModelAndView("redirect:/usuario/lista");
    }

}
