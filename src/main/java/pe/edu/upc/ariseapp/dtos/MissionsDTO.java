package pe.edu.upc.ariseapp.dtos;

import pe.edu.upc.ariseapp.entities.User;

public class MissionsDTO {
    private int idMissions;
    private String name;
    private String description;
    private User user;

    public int getIdMissions() {
        return idMissions;
    }

    public void setIdMissions(int idMissions) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
