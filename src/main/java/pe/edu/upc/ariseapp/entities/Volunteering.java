package pe.edu.upc.ariseapp.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "volunteerings")
public class Volunteering {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVolunteering;

    @Column(name = "nameVolunteering",nullable = false,length = 45)
    private String nameVolunteering;

    @Column(name = "activityVolunteering",nullable = false, length = 100)
    private String activityVolunteering;

    @Column(name = "attendanceVolunteering",nullable = false)
    private Boolean attendanceVolunteering;

    @Column(name = "areaVolunteering",nullable = false, length = 45)
    private String areaVolunteering;

    public Volunteering() {}

    public int getIdVolunteering() {
        return idVolunteering;
    }

    public void setIdVolunteering(int idVolunteering) {
        this.idVolunteering = idVolunteering;
    }

    public String getNameVolunteering() {
        return nameVolunteering;
    }

    public void setNameVolunteering(String nameVolunteering) {
        this.nameVolunteering = nameVolunteering;
    }

    public String getActivityVolunteering() {
        return activityVolunteering;
    }

    public void setActivityVolunteering(String activityVolunteering) {
        this.activityVolunteering = activityVolunteering;
    }

    public Boolean getAttendanceVolunteering() {
        return attendanceVolunteering;
    }

    public void setAttendanceVolunteering(Boolean attendanceVolunteering) {
        this.attendanceVolunteering = attendanceVolunteering;
    }

    public String getAreaVolunteering() {
        return areaVolunteering;
    }

    public void setAreaVolunteering(String areaVolunteering) {
        this.areaVolunteering = areaVolunteering;
    }

    public Volunteering(int idVolunteering, String nameVolunteering, String activityVolunteering, Boolean attendanceVolunteering, String areaVolunteering) {
        this.idVolunteering = idVolunteering;
        this.nameVolunteering = nameVolunteering;
        this.activityVolunteering = activityVolunteering;
        this.attendanceVolunteering = attendanceVolunteering;
        this.areaVolunteering = areaVolunteering;
    }
}