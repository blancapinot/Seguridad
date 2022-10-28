package cl.awakelab.models.DAO;

import cl.awakelab.models.Usuario;

import java.util.List;

public interface IUsuarioDao {


    public void create(Usuario usuario);

    public List<Usuario> obtener();

    public Usuario readOne(Integer id);

    public void actualizar(Usuario usuario);

    public void eliminar(int id);
}
