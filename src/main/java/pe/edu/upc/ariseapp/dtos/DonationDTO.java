package pe.edu.upc.ariseapp.dtos;


public class DonationDTO {
    private int idDonation;
    private int idNameDonation;
    private String donation;

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
}