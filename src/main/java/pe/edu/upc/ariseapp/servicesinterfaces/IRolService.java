package pe.edu.upc.ariseapp.servicesinterfaces;

import pe.edu.upc.ariseapp.entities.Rol;

import java.util.List;

public interface IRolService {
    public List<Rol> list();
    public void insert(Rol ro);
    public Rol listId(int idRol);
    public void update(Rol ro);
    public void delete(int idRol);
}
