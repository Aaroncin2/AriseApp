package pe.edu.upc.ariseapp.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "comments")

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComment;





    public Comment() {
    }

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    }

    }

    }

    }

    }

    }

        this.idComment = idComment;
    }
}
