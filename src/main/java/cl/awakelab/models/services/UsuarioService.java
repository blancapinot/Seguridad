package cl.awakelab.models.services;

import cl.awakelab.models.entities.Usuario;
import cl.awakelab.models.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService{

    @Autowired
     private IUsuarioRepository usuarioRepository;

    public UsuarioService(IUsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //Metodos para CRUD
    public List<Usuario> getAll(){
        return usuarioRepository.findAll();
    }
    public Optional<Usuario> getOne(Long idUsuario){
        return usuarioRepository.findById(Math.toIntExact(idUsuario));
    }
    public void create(Usuario usuario){
        usuarioRepository.save(usuario);
    }
    public void update(Usuario usuario){
        usuarioRepository.save(usuario);
    }
    public void delete(Long idUsuario){
        usuarioRepository.deleteById(Math.toIntExact(idUsuario));
    }
}
