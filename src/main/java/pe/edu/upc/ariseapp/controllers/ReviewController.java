package pe.edu.upc.ariseapp.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ariseapp.dtos.ReviewDTO;
import pe.edu.upc.ariseapp.entities.Review;
import pe.edu.upc.ariseapp.servicesinterfaces.IReviewService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    private IReviewService rS;
    @GetMapping

    public List<ReviewDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, ReviewDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/{idReview}")
    public ReviewDTO listarId(@PathVariable("idReview") int idReview) {
        ModelMapper m = new ModelMapper();
        ReviewDTO dto = m.map(rS.listId(idReview), ReviewDTO.class);
        return dto;
    }
    @PostMapping
    @PreAuthorize("hasAnyAuthority('ECOLOGISTA', 'ADMIN')")
    public void insertar(@RequestBody ReviewDTO rDto){
        ModelMapper modelMapper = new ModelMapper();
        Review r = modelMapper.map(rDto, Review.class);
        rS.insert(r);
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('ECOLOGISTA', 'ADMIN')")
    public void modificar(@RequestBody ReviewDTO rDTO) {
        ModelMapper m = new ModelMapper();
        Review r = m.map(rDTO, Review.class);
        rS.update(r);
    }
    @DeleteMapping("/{idReview}")
    @PreAuthorize("hasAnyAuthority('ECOLOGISTA', 'ADMIN')")
    public void eliminar(@PathVariable("idReview") int idReview) {
        rS.delete(idReview);
    }
}

