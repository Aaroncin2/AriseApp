package pe.edu.upc.ariseapp.servicesinterfaces;

import pe.edu.upc.ariseapp.entities.Missions;

import java.util.List;

public interface IMissionsService {
    public List<Missions> list();
    public void insert(Missions mi);
    public Missions listId(int idMissions);
    public void update(Missions mi);
    public void delete(int idMissions);
}