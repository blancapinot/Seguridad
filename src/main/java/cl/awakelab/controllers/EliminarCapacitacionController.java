package cl.awakelab.controllers;

import cl.awakelab.models.entities.Capacitacion;
import cl.awakelab.models.service.CapacitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class EliminarCapacitacionController {


    @Autowired
    private CapacitacionService capacitacionService;

    /**
     * Maneja las solicitudes que se le hacen a la raíz del sitio
     *
     * @return un objeto {@link ModelAndView} con la respuesta al cliente
     */
   // @RequestMapping(path = "/listarCapacitaciones", method = RequestMethod.GET)
    //public ModelAndView listarCpacitaciones() {
    //    return new ModelAndView("listarCapacitaciones");
  //  }

    @RequestMapping(value = "/EliminarCapacitacion", method = RequestMethod.POST)
    public ModelAndView eliminar(@ModelAttribute("id_capacitacion") Capacitacion capacitacion) {
        capacitacionService.delete(capacitacion.getId());
        List<Capacitacion> listarCapacitacion = capacitacionService.getAll();
        return new ModelAndView("listarCapacitaciones","capacitaciones",listarCapacitacion);
    }

}


