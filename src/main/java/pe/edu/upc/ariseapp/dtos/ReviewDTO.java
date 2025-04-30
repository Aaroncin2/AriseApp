package pe.edu.upc.ariseapp.dtos;

import pe.edu.upc.ariseapp.entities.*;

public class ReviewDTO {
    private int idReview;
    private String categoryReview;
    private int calificacionReview;
    private String textReview;
    private User user;
    private Missions missions;
    private Rewards rewards;
    private Volunteering volunteering;
    private Campaign campaign;

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

    public Rewards getRecompensas() {
        return rewards;
    }

    public void setRecompensas(Rewards rewards) {
        this.rewards = rewards;
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
