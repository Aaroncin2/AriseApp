package pe.edu.upc.ariseapp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ariseapp.dtos.VolunteeringDTO;
import pe.edu.upc.ariseapp.dtos.VolunteeringDTO;
import pe.edu.upc.ariseapp.entities.Campaign;
import pe.edu.upc.ariseapp.entities.Volunteering;
import pe.edu.upc.ariseapp.servicesinterfaces.ICampaignService;
import pe.edu.upc.ariseapp.servicesinterfaces.IVolunteeringService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/volunteering")
public class VolunteeringController {
    @Autowired
    private IVolunteeringService vS;
    @GetMapping
    public List<VolunteeringDTO> listar(){
        return vS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, VolunteeringDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{idVolunteering}")
    public VolunteeringDTO listarId(@PathVariable("idVolunteering") int idVolunteering) {
        ModelMapper m = new ModelMapper();
        VolunteeringDTO dto = m.map(vS.listId(idVolunteering), VolunteeringDTO.class);
        return dto;
    }
    @PostMapping
    public void insertar(@RequestBody VolunteeringDTO vDto){
        ModelMapper modelMapper = new ModelMapper();
        Volunteering v = modelMapper.map(vDto, Volunteering.class);
        vS.insert(v);
    }

    @PutMapping
    public void modificar(@RequestBody VolunteeringDTO vDto) {
        ModelMapper m = new ModelMapper();
        Volunteering v = m.map(vDto, Volunteering.class);
        vS.update(v);
    }
    @DeleteMapping("/{idVolunteering}")
    public void eliminar(@PathVariable("idVolunteering") int idVolunteering) {
        vS.delete(idVolunteering);
    }
}
