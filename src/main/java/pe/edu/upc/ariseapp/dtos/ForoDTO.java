package pe.edu.upc.ariseapp.dtos;


public class ForoDTO {
    private int idForo;
    private String nameForo;
    private String contenidoForo;
    private String dateForo;

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