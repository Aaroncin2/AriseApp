package pe.edu.upc.ariseapp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Missions {
    @Id
    private int id;

    @Column(name ="name",nullable = false,length=50)
    private String name;

    @Column(name ="description", nullable = false,length=50)
    private String description;

    @ManyToOne
    @JoinColumn(name="idUser", nullable=false)
    private User user;

    public Missions() {
    }

    public Missions(int id, String name, String description, User user) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
