package pe.edu.upc.ariseapp.servicesinterfaces;

import pe.edu.upc.ariseapp.entities.Rewards;

import java.util.List;

public interface IRewardsService {
    public List<Rewards> list();
    public void insert(Rewards re);
    public Rewards listId(int idReward);
    public void update(Rewards re);
    public void delete(int idReward);

}
