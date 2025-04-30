package pe.edu.upc.ariseapp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ariseapp.dtos.ForoDTO;
import pe.edu.upc.ariseapp.entities.Foro;
import pe.edu.upc.ariseapp.servicesinterfaces.IForoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/foros")
public class ForoController {
    @Autowired
    private IForoService fS;
    @GetMapping
    public List<ForoDTO> listar(){
        return fS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, ForoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{idForo}")
    public ForoDTO listarId(@PathVariable("idForo") int idForo) {
        ModelMapper m = new ModelMapper();
        ForoDTO dto = m.map(fS.listId(idForo), ForoDTO.class);
        return dto;
    }
    @PostMapping
    public void insertar(@RequestBody ForoDTO fDTO){
        ModelMapper modelMapper = new ModelMapper();
        Foro f= modelMapper.map(fDTO, Foro.class);
        fS.insert(f);
    }

    @PutMapping
    public void modificar(@RequestBody ForoDTO fDTO) {
        ModelMapper m = new ModelMapper();
        Foro f = m.map(fDTO, Foro.class);
        fS.update(f);
    }
    @DeleteMapping("/{idForo}")
    public void eliminar(@PathVariable("idForo") int idForo) {
        fS.delete(idForo);
    }
}
