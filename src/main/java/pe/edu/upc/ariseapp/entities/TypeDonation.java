package pe.edu.upc.ariseapp.entities;
import jakarta.persistence.*;

@Entity
@Table(name="typedonations")
public class TypeDonation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTypeDonation;

    @Column(name = "typeDonation" , nullable = false)
    private String typeDonation;

    @ManyToOne
    @JoinColumn(name="idDonation", nullable=false)
    private Donation donation;

    public TypeDonation() {

    }

    public TypeDonation(int idTypeDonation, String typeDonation) {
        this.idTypeDonation = idTypeDonation;
        this.typeDonation = typeDonation;
    }

    public int getIdTypeDonation() {
        return idTypeDonation;
    }

    public void setIdTypeDonation(int idTipoDonation) {
        this.idTypeDonation = idTipoDonation;
    }

    public String getTypeDonation() {
        return typeDonation;
    }

    public void setTypeDonation(String tipoDonation) {
        this.typeDonation = tipoDonation;
    }
}
