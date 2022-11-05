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

@Controller
@RequestMapping("/capacitacion")
public class EditarCapacitacionController {

    @Autowired
    private CapacitacionService capacitacionService;

    @RequestMapping(value = ("/crear"), method = RequestMethod.GET)
    public ModelAndView crearCapacitacion() {
        ModelAndView model = new ModelAndView();
        Capacitacion capacitacion = new Capacitacion();
        model.addObject("capacitacionForm", capacitacion);
        model.setViewName("crearCapacitacion");
        return model;
    }

    @RequestMapping(value = "/actualizar/{id}", method = RequestMethod.GET)
    public ModelAndView actualizarUsuario(@PathVariable Integer id) {
        ModelAndView model = new ModelAndView();
        Optional<Capacitacion> capacitacion = capacitacionService.getOne(id);
        model.addObject("capacitacionForm", capacitacion);
        model.setViewName("crearCapacitacion");
        return model;
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public ModelAndView guardarOEditarUsuario(@ModelAttribute("capacitacionForm") Capacitacion capacitacion) {
        if (capacitacion.getId() != null) {
            capacitacionService.update(capacitacion);
        } else {
            capacitacionService.create(capacitacion);
        }
        return new ModelAndView("redirect:/listarCapacitaciones");
    }

}
