package pe.edu.upc.ariseapp.entities;


import jakarta.persistence.*;

@Entity
@Table(name ="reward")
public class Reward {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReward;

    @Column(name = "reward", nullable = false, length = 50)
    private String reward;

    public Reward() {
    }

    public Reward(int idReward, String reward) {
        this.idReward = idReward;
        this.reward = reward;
    }

    public int getIdReward() {
        return idReward;
    }

    public void setIdReward(int idReward) {
        this.idReward = idReward;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }
}

