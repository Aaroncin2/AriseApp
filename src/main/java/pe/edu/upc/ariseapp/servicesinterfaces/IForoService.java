package pe.edu.upc.ariseapp.servicesinterfaces;

import pe.edu.upc.ariseapp.entities.Foro;

import java.util.List;

public interface IForoService {
    public List<Foro> list();
    public void insert(Foro f);
    public Foro listId(int idForo);
    public void update(Foro f);
    public void delete(int idForo);
}
