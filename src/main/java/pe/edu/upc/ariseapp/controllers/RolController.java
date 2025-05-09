package pe.edu.upc.ariseapp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import pe.edu.upc.ariseapp.dtos.RolDTO;
import pe.edu.upc.ariseapp.dtos.TypeDonationDTO;
import pe.edu.upc.ariseapp.entities.Rol;
import pe.edu.upc.ariseapp.entities.TypeDonation;
import pe.edu.upc.ariseapp.repositories.ITypeDonationRepository;
import pe.edu.upc.ariseapp.servicesinterfaces.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rol")
public class RolController {
    @Autowired
    private IRolService rS;

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<RolDTO> listar() {
        return rS.list().stream().map(r ->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(r, RolDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public RolDTO listarId(@PathVariable("id") Long idRol) {
        ModelMapper m = new ModelMapper();
        RolDTO dto = m.map(rS.listId(idRol), RolDTO.class);
        return dto;
    }

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insertar(@RequestBody RolDTO rDTO){
        ModelMapper modelMapper = new ModelMapper();
        Rol r= modelMapper.map(rDTO, Rol.class);
        rS.insert(r);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void modificar(@RequestBody RolDTO rDTO) {
        ModelMapper m = new ModelMapper();
        Rol r = m.map(rDTO, Rol.class);
        rS.update(r);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void eliminar(@PathVariable("id") Long id) {
        rS.delete(id);
    }
}
