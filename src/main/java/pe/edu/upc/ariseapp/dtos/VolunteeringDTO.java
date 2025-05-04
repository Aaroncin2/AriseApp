package pe.edu.upc.ariseapp.dtos;


public class VolunteeringDTO {
    private int idVolunteering;
    private String nameVolunteering;
    private String activityVolunteering;
    private Boolean attendanceVolunteering;
    private String areaVolunteering;

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

}