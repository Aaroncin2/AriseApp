package pe.edu.upc.ariseapp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ariseapp.entities.User;
import pe.edu.upc.ariseapp.servicesinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService aS;

    @GetMapping
    public List<UserDTO> list() {
        return aS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insert(@RequestBody UserDTO aDTO) {
        ModelMapper m = new ModelMapper();
        User a = m.map(aDTO, User.class);
        aS.insert(a);
    }

    @PutMapping
    public void update(@RequestBody UserDTO aDTO) {
        ModelMapper m = new ModelMapper();
        User a = m.map(aDTO, User.class);
        aS.update(a);
    }

    @DeleteMapping("/{idApp}")
    public void delete(@PathVariable("idApp") int idUser) {
        aS.delete(idUser);
    }

}
