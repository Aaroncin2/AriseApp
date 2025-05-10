package pe.edu.upc.ariseapp.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.ariseapp.entities.User;
import pe.edu.upc.ariseapp.repositories.IUsersRepository;
import pe.edu.upc.ariseapp.servicesinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplement implements IUserService {

    @Autowired
    private IUsersRepository uR;

    @Override
    public List<User> list() {return uR.findAll();}

    @Override
    public void insert(User u) {
        uR.save(u);
    }

    @Override
    public User listId(int idUser) {
        return uR.findById(idUser).orElse(new User());
    }

    @Override
    public void update(User u) {
        uR.save(u);
    }

    @Override
    public void delete(int idUser) {
        uR.deleteById(idUser);
    }

}