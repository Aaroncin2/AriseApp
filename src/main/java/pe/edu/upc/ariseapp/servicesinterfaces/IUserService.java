package pe.edu.upc.ariseapp.servicesinterfaces;

import pe.edu.upc.ariseapp.entities.User;

import java.util.List;

public interface IUserService {
    public List<User> list();
    public void insert(User u);
    public User listId(Long idUser);
    public void update(User u);
    public void delete(Long idUser);
}