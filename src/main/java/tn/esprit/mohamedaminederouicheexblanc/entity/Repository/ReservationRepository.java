package tn.esprit.mohamedaminederouicheexblanc.entity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.mohamedaminederouicheexblanc.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,String> {
}
