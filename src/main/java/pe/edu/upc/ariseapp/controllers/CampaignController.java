package pe.edu.upc.ariseapp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ariseapp.dtos.CampaignDTO;
import pe.edu.upc.ariseapp.entities.Campaign;
import pe.edu.upc.ariseapp.servicesinterfaces.ICampaignService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/campaign")
public class CampaignController {
    @Autowired
    private ICampaignService cS;
    @GetMapping
    public List<CampaignDTO> listar(){
        return cS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, CampaignDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{idCampaign}")
    public CampaignDTO listarId(@PathVariable("idCampaign") int idCampaign) {
        ModelMapper m = new ModelMapper();
        CampaignDTO dto = m.map(cS.listId(idCampaign), CampaignDTO.class);
        return dto;
    }
    @PostMapping
    public void insertar(@RequestBody CampaignDTO cDto){
        ModelMapper modelMapper = new ModelMapper();
        Campaign c= modelMapper.map(cDto, Campaign.class);
        cS.insert(c);
    }

    @PutMapping
    public void modificar(@RequestBody CampaignDTO cDTO) {
        ModelMapper m = new ModelMapper();
        Campaign c = m.map(cDTO, Campaign.class);
        cS.update(c);
    }
    @DeleteMapping("/{idCampaign}")
    public void eliminar(@PathVariable("idCampaign") int idCampaign) {
        cS.delete(idCampaign);
    }
}
