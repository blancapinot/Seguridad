package cl.awakelab.models.repositories;

import cl.awakelab.models.entities.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContactoRepository extends JpaRepository<Contacto, Integer>{
}

