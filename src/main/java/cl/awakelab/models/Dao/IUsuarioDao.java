package cl.awakelab.models.Dao;

import Models.Usuario;

import java.util.List;

public interface IUsuarioDao {

    Usuario create(Usuario usuario);

    List<Usuario> readAll();

    void delete(Long idUsuario);

    Usuario readOne(Long idUsuario);

    void update(Usuario usuario);
}
