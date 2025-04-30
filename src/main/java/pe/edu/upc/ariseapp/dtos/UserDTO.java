package pe.edu.upc.ariseapp.dtos;
import pe.edu.upc.ariseapp.entities.Rol;

import java.util.List;

public class UserDTO {
    private int idUser;
    private String nameUser;
    private String emailUser;
    private String numberUser;
    private String passwordUser;
    private List<Rol> rols;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getNumberUser() {
        return numberUser;
    }

    public void setNumberUser(String numberUser) {
        this.numberUser = numberUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public List<Rol> getRols() {
        return rols;
    }

    public void setRols(List<Rol> rols) {
        this.rols = rols;
    }

}
