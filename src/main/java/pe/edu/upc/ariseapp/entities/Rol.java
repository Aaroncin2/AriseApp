package pe.edu.upc.ariseapp.entities;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rols", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id","rol"})})
public class Rol implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    @Column(name="rol", nullable = false,length = 200)
    private String rol;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    public User getUser() {return user;}

    public void setUser(User user) {this.user = user;}

    public Long getIdRol() {return idRol;}

    public void setIdRol(Long idRol) {this.idRol = idRol;}

    public String getRol() {return rol;}

    public void setRol(String rol) {this.rol = rol;}

}