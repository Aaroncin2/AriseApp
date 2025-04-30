package pe.edu.upc.ariseapp.servicesimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.ariseapp.entities.Foro;
import pe.edu.upc.ariseapp.repositories.IForoRepository;
import pe.edu.upc.ariseapp.servicesinterfaces.IForoService;

import java.util.List;

@Service
public class ForoServiceImplement implements IForoService {
    @Autowired
    private IForoRepository fR;

    @Override
    public List<Foro> list() {return fR.findAll();}

    @Override
    public void insert(Foro f) {
        fR.save(f);
    }

    @Override
    public Foro listId(int idForo) {return fR.findById(idForo).orElse(new Foro());}

    @Override
    public void update(Foro f) {
        fR.save(f);
    }

    @Override
    public void delete(int idForo) {fR.deleteById(idForo);}
}
