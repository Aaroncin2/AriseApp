package pe.edu.upc.ariseapp.dtos;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.ariseapp.entities.Missions;
import pe.edu.upc.ariseapp.entities.Recompensas;

public class MissionRewardDTO {
    private int idMissionReward;
    private Missions missions;
    private Recompensas recompensas;

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

    public Recompensas getRecompensas() {
        return recompensas;
    }

    public void setRecompensas(Recompensas recompensas) {
        this.recompensas = recompensas;
    }

}
