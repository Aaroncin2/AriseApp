package pe.edu.upc.ariseapp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ariseapp.dtos.DonationDTO;
import pe.edu.upc.ariseapp.entities.Donation;
import pe.edu.upc.ariseapp.servicesinterfaces.IDonationService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/donations")
public class DonationController {
    @Autowired
    private IDonationService dS;
    @GetMapping
    public List<DonationDTO> listar(){
        return dS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, DonationDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{idDonation}")
    public DonationDTO listarId(@PathVariable("idDonation") int idDonation) {
        ModelMapper m = new ModelMapper();
        DonationDTO dto = m.map(dS.listId(idDonation), DonationDTO.class);
        return dto;
    }
    @PostMapping
    public void insertar(@RequestBody DonationDTO dDto){
        ModelMapper modelMapper = new ModelMapper();
        Donation d= modelMapper.map(dDto, Donation.class);
        dS.insert(d);
    }

    @PutMapping
    public void modificar(@RequestBody DonationDTO dDTO) {
        ModelMapper m = new ModelMapper();
        Donation d = m.map(dDTO, Donation.class);
        dS.update(d);
    }
    @DeleteMapping("/{idDonation}")
    public void eliminar(@PathVariable("idDonation") int idDonation) {
        dS.delete(idDonation);
    }
    
}
