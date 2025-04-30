package pe.edu.upc.ariseapp.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class TypeDonationDTO {
    private int idTypeDonation;
    private String typeDonation;

    public int getIdTypeDonation() {
        return idTypeDonation;
    }

    public void setIdTypeDonation(int idTypeDonation) {
        this.idTypeDonation = idTypeDonation;
    }

    public String getTypeDonation() {
        return typeDonation;
    }

    public void setTypeDonation(String typeDonation) {
        this.typeDonation = typeDonation;
    }

}
