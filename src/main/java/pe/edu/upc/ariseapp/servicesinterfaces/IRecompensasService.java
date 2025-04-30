package pe.edu.upc.ariseapp.servicesinterfaces;

import pe.edu.upc.ariseapp.entities.Recompensas;

import java.util.List;

public interface IRecompensasService {
    public List<Recompensas> list();
    public void insert(Recompensas re);
    public Recompensas listId(int idRecompensa);
    public void update(Recompensas re);
    public void delete(int idRecompensa);
}
