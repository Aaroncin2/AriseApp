package pe.edu.upc.ariseapp.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.ariseapp.entities.Campaign;
import pe.edu.upc.ariseapp.entities.Missions;
import pe.edu.upc.ariseapp.repositories.ICampaignRepository;
import pe.edu.upc.ariseapp.repositories.IMissionsRepository;
import pe.edu.upc.ariseapp.servicesinterfaces.IMissionsService;

import java.util.List;

@Service
public class MissionsServiceImplement implements IMissionsService {
    @Autowired
    private IMissionsRepository mR;

    @Override
    public List<Missions> list() {return mR.findAll();}

    @Override
    public void insert(Missions mi) {
        mR.save(mi);
    }

    @Override
    public Missions listId(int idMissions) {return mR.findById(idMissions).orElse(new Missions());}

    @Override
    public void update(Missions mi) {
        mR.save(mi);
    }

    @Override
    public void delete(int idMissions) {
        mR.deleteById(idMissions);
    }
}
