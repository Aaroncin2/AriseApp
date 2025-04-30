package pe.edu.upc.ariseapp.entities;

import jakarta.persistence.*;
@Entity
@Table(name= "Missions")
public class Missions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMissions;

    @Column(name ="nameMissions",nullable = false,length=50)
    private String nameMissions;

    @Column(name ="description", nullable = false,length=50)
    private String description;

    @ManyToOne
    @JoinColumn(name="idUser", nullable=false)
    private User user;

    public Missions() {
    }

    public Missions(int idMissions, String nameMissions, String description, User user) {
        this.idMissions = idMissions;
        this.nameMissions = nameMissions;
        this.description = description;
        this.user = user;
    }

    public int getIdMissions() {
        return idMissions;
    }

    public void setIdMissions(int idMissions) {
        this.idMissions = idMissions;
    }

    public String getNameMissions() {
        return nameMissions;
    }

    public void setNameMissions(String nameMissions) {
        this.nameMissions = nameMissions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
