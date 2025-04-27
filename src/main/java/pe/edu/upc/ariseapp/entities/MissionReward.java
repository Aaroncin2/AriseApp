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
    @JoinColumn(name="idRecompensas", nullable=false)
    private Recompensas recompensas;

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

    public Recompensas getRecompensas() {
        return recompensas;
    }

    public void setRecompensas(Recompensas recompensas) {
        this.recompensas = recompensas;
    }
}
