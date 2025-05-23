package pe.edu.upc.ariseapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.ariseapp.entities.Volunteering;

@Repository
public interface IVolunteeringRepository extends JpaRepository<Volunteering, Integer> {
}
