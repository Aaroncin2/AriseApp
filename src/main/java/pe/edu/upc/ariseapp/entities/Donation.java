package pe.edu.upc.ariseapp.entities;


import jakarta.persistence.*;

@Entity
@Table(name="donation")
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDonation;

    @Column(name=" NameDonation" , nullable = false)
    private int idNameDonation;

    @Column(name = "Donation" , nullable = false)
    private String donation;


    public Donation(int idDonation, int idNameDonation, String donation) {
        this.idDonation = idDonation;
        this.idNameDonation = idNameDonation;
        this.donation = donation;
    }

    public int getIdDonation() {
        return idDonation;
    }

    public void setIdDonation(int idDonation) {
        this.idDonation = idDonation;
    }

    public int getIdNameDonation() {
        return idNameDonation;
    }

    public void setIdNameDonation(int idNameDonation) {
        this.idNameDonation = idNameDonation;
    }

    public String getDonation() {
        return donation;
    }

    public void setDonation(String donation) {
        this.donation = donation;
    }

    public Donation() {


    }

}
