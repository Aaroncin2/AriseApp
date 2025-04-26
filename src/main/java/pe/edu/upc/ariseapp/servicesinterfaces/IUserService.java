package pe.edu.upc.ariseapp.servicesinterfaces;

import pe.edu.upc.ariseapp.entities.User;

import java.util.List;

public interface IUserService {
    public List<User> list();
    public void insert(User a);
    public User listId(int idUser);
    public void update(User a);
    public void delete(int idUser);

}
