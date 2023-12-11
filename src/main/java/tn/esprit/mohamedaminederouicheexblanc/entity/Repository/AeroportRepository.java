package tn.esprit.mohamedaminederouicheexblanc.entity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.mohamedaminederouicheexblanc.entity.Aeroport;
@Repository
public interface AeroportRepository extends JpaRepository<Aeroport,Integer> {
}
