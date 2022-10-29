package cl.awakelab.controllers;

import cl.awakelab.models.entities.Capacitacion;
import cl.awakelab.models.services.CapacitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CapacitacionController {
    @Autowired
    private CapacitacionService cs;
    public ModelAndView readAll(){
        List<Capacitacion> listarCapacitaciones = cs.getAll();
        return new ModelAndView("listarCapacitaciones","capacitaciones",listarCapacitaciones);
    }
}
