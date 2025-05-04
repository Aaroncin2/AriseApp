package pe.edu.upc.ariseapp.dtos;
import pe.edu.upc.ariseapp.entities.Missions;
import pe.edu.upc.ariseapp.entities.Reward;

public class MissionRewardDTO {
    private int idMissionReward;
    private Missions missions;
    private String description;
    private Reward reward;

    public int getIdMissionReward() {
        return idMissionReward;
    }

    public void setIdMissionReward(int idMissionReward) {
        this.idMissionReward = idMissionReward;
    }

    public Missions getMissions() {
        return missions;
    }

    public void setMissions(Missions missions) {
        this.missions = missions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Reward getReward() {
        return reward;
    }

    public void setReward(Reward reward) {
        this.reward = reward;
    }

}