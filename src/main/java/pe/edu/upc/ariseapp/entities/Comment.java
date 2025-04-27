package pe.edu.upc.ariseapp.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "comments")

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComment;

    @Column(name = "category",nullable = false,length = 20)
    private String category;

    @Column(name = "description",nullable = false, length = 100)
    private String description;

    @Column(name = "date",nullable = false)
    private LocalDate date;


    public Comment() {
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Comment(int idComment, String category, String description, LocalDate date) {
        this.idComment = idComment;
        this.category = category;
        this.description = description;
        this.date = date;
    }
}
