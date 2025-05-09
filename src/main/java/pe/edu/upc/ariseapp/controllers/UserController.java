package pe.edu.upc.ariseapp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ariseapp.dtos.UserDTO;
import pe.edu.upc.ariseapp.entities.User;
import pe.edu.upc.ariseapp.servicesinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService uS;

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ECOLOGISTA', 'ADMIN')")
    public List<UserDTO> listar(){
        return uS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{idUser}")
    @PreAuthorize("hasAnyAuthority('ECOLOGISTA', 'ADMIN')")
    public UserDTO listarId(@PathVariable("idUser") Long idUser) {
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map(uS.listId(idUser), UserDTO.class);
        return dto;
    }

    @PostMapping
    public void insertar(@RequestBody UserDTO uDTO){
        ModelMapper modelMapper = new ModelMapper();
        User u= modelMapper.map(uDTO, User.class);
        uS.insert(u);
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('ECOLOGISTA', 'ADMIN', 'VOLUNTARIO')")
    public void modificar(@RequestBody UserDTO uDTO) {
        ModelMapper m = new ModelMapper();
        User u = m.map(uDTO, User.class);
        uS.update(u);
    }

    @DeleteMapping("/{idUser}")
    @PreAuthorize("hasAnyAuthority('ECOLOGISTA', 'ADMIN', 'VOLUNTARIO')")
    public void eliminar(@PathVariable("idUser") Long idUser) {
        uS.delete(idUser);
    }
}

