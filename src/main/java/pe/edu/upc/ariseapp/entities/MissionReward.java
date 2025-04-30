package pe.edu.upc.ariseapp.entities;

import jakarta.persistence.*;

@Entity
@Table(name ="MissionReward")
public class MissionReward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMissionReward;

    @ManyToOne
    @JoinColumn(name="idmissions", nullable=false)
    private Missions missions;

    @Column(name = "description" , nullable = false , length = 200)
    private String description;

    @ManyToOne
    @JoinColumn(name="idreward", nullable=false)
    private Reward reward;

    public MissionReward(){
    }

    public MissionReward(int idMissionReward, Missions missions, String description, Reward reward) {
        this.idMissionReward = idMissionReward;
        this.missions = missions;
        this.description = description;
        this.reward = reward;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Reward getReward() {
        return reward;
    }

    public void setReward(Reward reward) {
        this.reward = reward;
    }
}
