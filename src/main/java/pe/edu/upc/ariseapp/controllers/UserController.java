package pe.edu.upc.ariseapp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<UserDTO> listar(){
        return uS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{idUser}")
    public UserDTO listarId(@PathVariable("idUser") int idUser) {
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map(uS.listId(idUser), UserDTO.class);
        return dto;
    }
    @PostMapping
    public void insertar(@RequestBody UserDTO uDto){
        ModelMapper modelMapper = new ModelMapper();
        User u= modelMapper.map(uDto, User.class);
        uS.insert(u);
    }

    @PutMapping
    public void modificar(@RequestBody UserDTO uUser) {
        ModelMapper m = new ModelMapper();
        User u = m.map(uUser, User.class);
        uS.update(u);
    }
    @DeleteMapping("/{idUser}")
    public void eliminar(@PathVariable("idUser") int idUser) {
        uS.delete(idUser);
    }
}

