package cl.awakelab.controllers;

import cl.awakelab.models.entities.Usuario;
import cl.awakelab.models.services.UsuarioService;
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
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public ModelAndView mostrarUsuarios() {
        ModelAndView model = new ModelAndView();
        List<Usuario> usuarios = usuarioService.getAll();
        model.addObject("usuario", usuarios);
        model.setViewName("listarUsuarios");
        return model;
    }


    @RequestMapping(value = ("/crear"), method = RequestMethod.GET)
    public ModelAndView crearUsuario() {
        ModelAndView model = new ModelAndView();
        Usuario usuario = new Usuario();
        model.addObject("usuario", usuario);
        model.setViewName("crearUsuario");
        return model;
    }

    @RequestMapping(value = "/actualizar/{idUsuario}", method = RequestMethod.GET)
    public ModelAndView actualizarUsuario(@PathVariable Integer idUsuario) {
        ModelAndView model = new ModelAndView();
        Optional<Usuario> usuario = usuarioService.getOne(idUsuario);
        model.addObject("usuario", usuario);
        model.setViewName("crearUsuario");
        return model;
    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public ModelAndView guardarOEditarUsuario(@ModelAttribute("usuarioForm") Usuario usuario) {
        if (usuario.getIdUsuario() != null) {
            usuarioService.update(usuario);
        } else {
            usuarioService.create(usuario);
        }
        return new ModelAndView("redirect:/usuario/listar");
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.GET)
    public ModelAndView eliminarUsuario(@PathVariable("id") Integer id) {
        usuarioService.delete(id);
        return new ModelAndView("redirect:/usuario/listar");
    }

}
