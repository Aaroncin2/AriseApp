package pe.edu.upc.ariseapp.entities;


import jakarta.persistence.*;

@Table(name = "Foro")
public class Foro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idForo;

    @Column(name = "nameForo" , nullable = false)
    private String nameForo;

    @Column(name = "contenidoForo" , nullable = false , length = 200)
    private String contenidoForo;

    @Column(name = "dateForo", nullable = false)
    private String dateForo;



    public Foro() {}

    public Foro(int idForo, String nameForo, String contenidoForo, String dateForo) {
        this.idForo = idForo;
        this.nameForo = nameForo;
        this.contenidoForo = contenidoForo;
        this.dateForo = dateForo;
    }

    public int getIdForo() {
        return idForo;
    }

    public void setIdForo(int idForo) {
        this.idForo = idForo;
    }

    public String getNameForo() {
        return nameForo;
    }

    public void setNameForo(String nameForo) {
        this.nameForo = nameForo;
    }

    public String getContenidoForo() {
        return contenidoForo;
    }

    public void setContenidoForo(String contenidoForo) {
        this.contenidoForo = contenidoForo;
    }

    public String getDateForo() {
        return dateForo;
    }

    public void setDateForo(String dateForo) {
        this.dateForo = dateForo;
    }
}
