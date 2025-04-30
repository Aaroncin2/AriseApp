package pe.edu.upc.ariseapp.dtos;

import jakarta.persistence.Column;

public class RecompensasDTO {
    private int idRecompensa;
    private String recompensas;

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
