package cl.awakelab.controllers;

import cl.awakelab.models.Capacitacion;
import cl.awakelab.models.service.CapacitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ListarCapacitacionController {
    @Autowired
    private CapacitacionService pc;
    @RequestMapping(value = "/listarCapacitacion",method = RequestMethod.GET)
    public ModelAndView listarCapacitacion(){
        List<Capacitacion> listarCapacitacion = pc.getAll();
        return new ModelAndView("listarCapacitacion","listarCapacitacion",listarCapacitacion);
    }

}