package pe.edu.upc.ariseapp.entities;


import jakarta.persistence.*;

@Entity
@Table(name="donation")
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDonation;

    @Column(name="NameDonation" , nullable = false, length = 50)
    private String NameDonation;

    @Column(name = "Donation" , nullable = false, length = 50)
    private String Donation;

    public Donation() {

    }
    public Donation(int idDonation, String NameDonation, String Donation) {
        this.idDonation = idDonation;
        this.NameDonation = NameDonation;
        this.Donation = Donation;
    }

    public int getIdDonation() {
        return idDonation;
    }

    public void setIdDonation(int idDonation) {
        this.idDonation = idDonation;
    }

    public String getNameDonation() {
        return NameDonation;
    }

    public void setNameDonation(int idNameDonation) {
        this.NameDonation = NameDonation;
    }

    public String getDonation() {
        return Donation;
    }

    public void setDonation(String donation) {
        this.Donation = Donation;
    }

}
