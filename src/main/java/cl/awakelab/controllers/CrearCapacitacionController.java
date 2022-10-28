package cl.awakelab.controllers;

import cl.awakelab.models.Capacitacion;
import cl.awakelab.models.service.CapacitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CrearCapacitacionController {

    @Autowired
    private CapacitacionService capacitacionService;

    /**
     * Maneja las solicitudes que se le hacen a la raíz del sitio
     *
     * @return un objeto {@link ModelAndView} con la respuesta al cliente
     */
    @RequestMapping(path = "/crear-capacitacion", method = RequestMethod.GET)
    public ModelAndView miCrearCapacitacion() {
        return new ModelAndView("crearCapacitacion");
    }

    @RequestMapping(value = "/crear-capacitacion", method = RequestMethod.POST)
    public ModelAndView crear(@ModelAttribute("capacitacion") Capacitacion capacitacion) {
        capacitacionService.create(capacitacion);

        return new ModelAndView("crearCapacitacion");
    }

}
