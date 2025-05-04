package pe.edu.upc.ariseapp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ariseapp.dtos.CommentDTO;
import pe.edu.upc.ariseapp.entities.Comment;
import pe.edu.upc.ariseapp.servicesinterfaces.ICommentService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @Autowired
    private ICommentService cS;
    @GetMapping
    public List<CommentDTO> listar(){
        return cS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, CommentDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{idComment}")
    public CommentDTO listarId(@PathVariable("idComment") int idComment) {
        ModelMapper m = new ModelMapper();
        CommentDTO dto = m.map(cS.listId(idComment), CommentDTO.class);
        return dto;
    }
    @PostMapping
    @PreAuthorize("hasAnyAuthority('ECOLOGISTA', 'ADMIN','VOLUNTARIO')")
    public void insertar(@RequestBody CommentDTO cDto){
        ModelMapper modelMapper = new ModelMapper();
        Comment c= modelMapper.map(cDto, Comment.class);
        cS.insert(c);
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('ECOLOGISTA', 'ADMIN','VOLUNTARIO')")
    public void modificar(@RequestBody CommentDTO cDTO) {
        ModelMapper m = new ModelMapper();
        Comment c = m.map(cDTO, Comment.class);
        cS.update(c);
    }
    @DeleteMapping("/{idComment}")
    @PreAuthorize("hasAnyAuthority('ECOLOGISTA', 'ADMIN','VOLUNTARIO')")
    public void eliminar(@PathVariable("idComment") int idComment) {
        cS.delete(idComment);
    }
}
