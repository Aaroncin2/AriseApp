package pe.edu.upc.ariseapp.dtos;
import pe.edu.upc.ariseapp.entities.User;

public class RolDTO {
    private Long idRol;
    private String rol;
    private User user;

    public User getUser() {return user;}

    public void setUser(User user) {this.user = user;}

    public Long getIdRol() {return idRol;}

    public void setIdRol(Long idRol) {this.idRol = idRol;}

    public String getRol() {return rol;}

    public void setRol(String rol) {this.rol = rol;}
}