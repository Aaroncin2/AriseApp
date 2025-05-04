package pe.edu.upc.ariseapp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ariseapp.dtos.TypeDonationDTO;
import pe.edu.upc.ariseapp.entities.TypeDonation;
import pe.edu.upc.ariseapp.servicesinterfaces.ITypeDonationService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/typeDonations")
public class TypeDonationController {
    @Autowired
    private ITypeDonationService tS;
    @GetMapping
    @PreAuthorize("hasAuthority('ECOLOGISTA, ADMIN')")
    public List<TypeDonationDTO> listar(){
        return tS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, TypeDonationDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{idTypeDonation}")
    @PreAuthorize("hasAnyAuthority('ECOLOGISTA, ADMIN')")
    public TypeDonationDTO listarId(@PathVariable("idTypeDonation") int idTypeDonation) {
        ModelMapper m = new ModelMapper();
        TypeDonationDTO dto = m.map(tS.listId(idTypeDonation), TypeDonationDTO.class);
        return dto;
    }
    @PostMapping
    @PreAuthorize("hasAnyAuthority('ECOLOGISTA', 'ADMIN')")
    public void insertar(@RequestBody TypeDonationDTO tDto){
        ModelMapper modelMapper = new ModelMapper();
        TypeDonation td= modelMapper.map(tDto, TypeDonation.class);
        tS.insert(td);
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('ECOLOGISTA', 'ADMIN')")
    public void modificar(@RequestBody TypeDonationDTO tDTO) {
        ModelMapper m = new ModelMapper();
        TypeDonation td = m.map(tDTO, TypeDonation.class);
        tS.update(td);
    }
    @DeleteMapping("/{idTypeDonation}")
    @PreAuthorize("hasAnyAuthority('ECOLOGISTA', 'ADMIN')")
    public void eliminar(@PathVariable("idTypeDonation") int idTypeDonation) {
        tS.delete(idTypeDonation);
    }
}
