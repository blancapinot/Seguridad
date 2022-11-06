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

import java.util.List;
import java.util.Optional;
@RequestMapping("/capacitacion")
@Controller
public class CapacitacionController {

    @Autowired
    private CapacitacionService CapacitacionService;

    @RequestMapping(value = ("/lista"), method = RequestMethod.GET)
    public ModelAndView listarCapacitaciones(){
        ModelAndView model = new ModelAndView();
        List<Capacitacion> capacitaciones = CapacitacionService.getAll();
        model.addObject("capacitaciones", capacitaciones);
        model.setViewName("listarCapacitaciones");
        return model;
    }

    @RequestMapping(value = ("/agregar"), method = RequestMethod.GET) //lo voy a usar en el boton para mostrar el formulario de crearUsuario
    public ModelAndView agregarCapacitacion(){
        ModelAndView model = new ModelAndView();
        Capacitacion capacitacion = new Capacitacion();
        model.addObject("capacitacionForm", capacitacion);
        model.setViewName("crearCapacitacion");
        return model;
    }

    @RequestMapping(value = "/guardar/{id}", method = RequestMethod.GET)
    public ModelAndView actualizarCapacitacion(@PathVariable Integer id){
        ModelAndView model = new ModelAndView();
        Optional<Capacitacion> capacitacion = CapacitacionService.getOne(id);
        model.addObject("capacitacionForm", capacitacion);
        model.setViewName("crearCapacitacion");
        return model;
    }
    @RequestMapping(value = "/guardar/{id}", method = RequestMethod.POST)
    public ModelAndView actualizarFormCapacitacion(@ModelAttribute("capacitacionForm") Capacitacion capacitacion){
        if(capacitacion.getId() != null){
            CapacitacionService.update(capacitacion);
        } else {
            CapacitacionService.create(capacitacion);
        }
        return  new ModelAndView("redirect:/capacitacion/lista");
    }


    /**
     * Para obtener formulario
     */
    @RequestMapping(value = "/guardar", method = RequestMethod.GET)
    public ModelAndView mostrarFormCapacitacion() {
        ModelAndView model = new ModelAndView();
        Capacitacion capacitacion = new Capacitacion();
        model.addObject("capacitacionForm", capacitacion);
        model.setViewName("crearCapacitacion");
        return model;
    }

    /**
     * Guardar formulario
     */
    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public ModelAndView guardarOEditarFormCapacitacion(@ModelAttribute("capacitacionForm") Capacitacion capacitacion){
        if(capacitacion.getId() != null){
            CapacitacionService.update(capacitacion);
        } else {
            CapacitacionService.create(capacitacion);
        }
        return  new ModelAndView("redirect:/capacitacion/lista");
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.GET)
    public ModelAndView eliminarCapacitacion(@PathVariable("id") Integer id){
        CapacitacionService.delete(id);
        System.out.println(id);
        return new ModelAndView("redirect:/capacitacion/lista");
    }


}
