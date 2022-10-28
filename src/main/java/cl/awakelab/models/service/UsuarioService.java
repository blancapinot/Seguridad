package cl.awakelab.models.service;

import cl.awakelab.models.DAO.UsuarioDaoImpl;
import cl.awakelab.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService<usuario> {

    @Autowired
    UsuarioDaoImpl uDao;

    public UsuarioService() {
    }
    public void create(Usuario usuario){
        uDao.create(usuario);
    }

public List<Usuario> getAll() {
        return uDao.obtener();
}
    public Usuario getOne(Integer id){
        return uDao.readOne(id);
    }
    public void update(Usuario usuario) {uDao.actualizar(usuario);
    }
    public void delete(int id) {
        uDao.eliminar(id);
    }
}
