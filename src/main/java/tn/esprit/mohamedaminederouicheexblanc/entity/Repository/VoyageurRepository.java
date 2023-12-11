package tn.esprit.mohamedaminederouicheexblanc.entity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.mohamedaminederouicheexblanc.entity.Vol;
import tn.esprit.mohamedaminederouicheexblanc.entity.Voyageur;
@Repository
public interface VoyageurRepository extends JpaRepository<Voyageur,Integer> {
}
