package pe.edu.upc.ariseapp.entities;

import jakarta.persistence.*;

@Entity
@Table(name ="MissionReward")
public class MissionReward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMissionReward;

    @ManyToOne
    @JoinColumn(name="idMissions", nullable=false)
    private Missions missions;

    @ManyToOne
    @JoinColumn(name="idRewards", nullable=false)
    private Rewards rewards;

    public MissionReward() {
    }

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

    public Rewards getRewards() {
        return rewards;
    }

    public void setRewards(Rewards rewards) {
        this.rewards = rewards;
    }
}
