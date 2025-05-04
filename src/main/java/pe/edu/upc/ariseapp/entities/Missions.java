package pe.edu.upc.ariseapp.entities;

import jakarta.persistence.*;
@Entity
@Table(name= "Missions")
public class Missions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMissions;

    @Column(name ="name",nullable = false,length=50)
    private String name;

    @Column(name ="description", nullable = false,length=50)
    private String description;

    @ManyToOne
    @JoinColumn(name="idUser", nullable=false)
    private User user;

    public Missions() {}

    public Missions(int id, String name, String description, User user) {
        this.idMissions = idMissions;
        this.name = name;
        this.description = description;
        this.user = user;
    }

    public int getId() {
        return idMissions;
    }

    public void setId(int idMissions) {
        this.idMissions = idMissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {return user;}

    public void setUser(User user) {
        this.user = user;
    }
}