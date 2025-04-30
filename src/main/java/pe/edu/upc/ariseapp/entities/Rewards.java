package pe.edu.upc.ariseapp.entities;


import jakarta.persistence.*;

@Entity
@Table(name ="Rewards")
public class Rewards {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReward;

    @Column(name = "rewards", nullable = false, length = 50)
    private String rewards;

    public Rewards() {
    }

    public Rewards(int idReward, String rewards) {
        this.idReward = idReward;
        this.rewards = rewards;
    }

    public int getIdReward() {
        return idReward;
    }

    public void setIdReward(int idReward) {
        this.idReward = idReward;
    }

    public String getRewards() {
        return rewards;
    }

    public void setRewards(String rewards) {
        this.rewards = rewards;
    }

}

