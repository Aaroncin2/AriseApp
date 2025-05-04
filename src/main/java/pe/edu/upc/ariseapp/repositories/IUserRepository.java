package pe.edu.upc.ariseapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.ariseapp.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

    public User findOneByNameUser(String nameUser);
}
