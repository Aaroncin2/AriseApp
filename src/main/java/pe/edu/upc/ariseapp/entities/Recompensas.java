package pe.edu.upc.ariseapp.entities;


import jakarta.persistence.*;

@Entity
@Table(name ="Recompensas")
public class Recompensas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRecompensa;

    @Column(name = "recompensas", nullable = false, length = 50)
    private String recompensas;

    public Recompensas() {
    }

    public Recompensas(int idRecompensa, String recompensa) {
        this.idRecompensa = idRecompensa;
        this.recompensas = recompensa;
    }

    public int getIdRecompensa() {
        return idRecompensa;
    }

    public void setIdRecompensa(int idRecompensa) {
        this.idRecompensa = idRecompensa;
    }

    public String getRecompensas() {
        return recompensas;
    }

    public void setRecompensas(String recompensas) {
        this.recompensas = recompensas;
    }
}

