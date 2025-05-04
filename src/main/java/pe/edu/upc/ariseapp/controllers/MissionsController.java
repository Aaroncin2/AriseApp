package pe.edu.upc.ariseapp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ariseapp.dtos.CampaignDTO;
import pe.edu.upc.ariseapp.dtos.MissionsDTO;
import pe.edu.upc.ariseapp.entities.Campaign;
import pe.edu.upc.ariseapp.entities.Missions;
import pe.edu.upc.ariseapp.servicesinterfaces.ICampaignService;
import pe.edu.upc.ariseapp.servicesinterfaces.IMissionsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/missions")
public class MissionsController {
    @Autowired
    private IMissionsService mS;
    @GetMapping
    public List<MissionsDTO> listar(){
        return mS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, MissionsDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{idMissions}")
    public MissionsDTO listarId(@PathVariable("idMissions") int idMissions) {
        ModelMapper m = new ModelMapper();
        MissionsDTO dto = m.map(mS.listId(idMissions), MissionsDTO.class);
        return dto;
    }
    @PostMapping
    @PreAuthorize("hasAnyAuthority('ECOLOGISTA', 'ADMIN')")
    public void insertar(@RequestBody MissionsDTO mDto){
        ModelMapper modelMapper = new ModelMapper();
        Missions mi= modelMapper.map(mDto, Missions.class);
        mS.insert(mi);
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('ECOLOGISTA', 'ADMIN')")
    public void modificar(@RequestBody MissionsDTO mDTO) {
        ModelMapper m = new ModelMapper();
        Missions mi = m.map(mDTO, Missions.class);
        mS.update(mi);
    }
    @DeleteMapping("/{idMissions}")
    @PreAuthorize("hasAnyAuthority('ECOLOGISTA', 'ADMIN')")
    public void eliminar(@PathVariable("idMissions") int idMissions) {
        mS.delete(idMissions);
    }
}
