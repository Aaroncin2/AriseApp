package pe.edu.upc.ariseapp.dtos;
import pe.edu.upc.ariseapp.entities.User;

public class MissionsDTO {
    private int idMissions;
    private String nameMissions;
    private String description;
    private User user;

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
