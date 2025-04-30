package pe.edu.upc.ariseapp.dtos;

import pe.edu.upc.ariseapp.entities.Missions;
import pe.edu.upc.ariseapp.entities.Rewards;

public class MissionRewardDTO {
    private int idMissionReward;
    private Missions missions;
    private Rewards rewards;

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

    public Rewards getRecompensas() {
        return rewards;
    }

    public void setRecompensas(Rewards rewards) {
        this.rewards = rewards;
    }

}
