package pe.edu.upc.ariseapp.entities;

import jakarta.persistence.*;
@Entity
@Table(name="review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReview;

    @Column(name = "categoryReview", nullable = false)
    private String categoryReview;

    @Column(name = "calificacionReview", nullable = false)
    private int calificacionReview;

    @Column(name = "textReview", nullable = false)
    private String textReview;

    @ManyToOne
    @JoinColumn(name = "user", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "missions", nullable = false)
    private Missions missions;

    @ManyToOne
    @JoinColumn(name = "reward", nullable = false)
    private Reward reward;

    @ManyToOne
    @JoinColumn(name = "volunteering", nullable = false)
    private Volunteering volunteering;

    @ManyToOne
    @JoinColumn(name = "campaign", nullable = false)
    private Campaign campaign;

    public Review() {
    }

    public Review(int idReview, String categoryReview, int calificacionReview, String textReview, User user, Missions missions, Reward reward, Volunteering volunteering, Campaign campaign) {
        this.idReview = idReview;
        this.categoryReview = categoryReview;
        this.calificacionReview = calificacionReview;
        this.textReview = textReview;
        this.user = user;
        this.missions = missions;
        this.reward = reward;
        this.volunteering = volunteering;
        this.campaign = campaign;
    }

    public int getIdReview() {
        return idReview;
    }

    public void setIdReview(int idReview) {
        this.idReview = idReview;
    }

    public String getCategoryReview() {
        return categoryReview;
    }

    public void setCategoryReview(String categoryReview) {
        this.categoryReview = categoryReview;
    }

    public int getCalificacionReview() {
        return calificacionReview;
    }

    public void setCalificacionReview(int calificacionReview) {
        this.calificacionReview = calificacionReview;
    }

    public String getTextReview() {
        return textReview;
    }

    public void setTextReview(String textReview) {
        this.textReview = textReview;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Missions getMissions() {
        return missions;
    }

    public void setMissions(Missions missions) {
        this.missions = missions;
    }

    public Reward getreward() {
        return reward;
    }

    public void setreward(Reward reward) {
        this.reward = reward;
    }

    public Volunteering getVolunteering() {
        return volunteering;
    }

    public void setVolunteering(Volunteering volunteering) {
        this.volunteering = volunteering;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }
}