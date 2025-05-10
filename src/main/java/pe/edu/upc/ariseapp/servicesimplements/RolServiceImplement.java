package pe.edu.upc.ariseapp.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.ariseapp.entities.Rol;
import pe.edu.upc.ariseapp.repositories.IRolRepository;
import pe.edu.upc.ariseapp.servicesinterfaces.IRewardService;
import pe.edu.upc.ariseapp.servicesinterfaces.IRolService;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {

@Autowired
private IRolRepository rR;

    @Override
    public List<Rol> list() {return rR.findAll();}

    @Override
    public void insert(Rol ro) {rR.save(ro);}

    @Override
    public Rol listId(int idRol) {return rR.findById(idRol).orElse(new Rol());}

    @Override
    public void update(Rol ro) {rR.save(ro);}

    @Override
    public void delete(int idRol) {rR.deleteById(idRol);}
}
