package tn.esprit.mohamedaminederouicheexblanc.entity.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.mohamedaminederouicheexblanc.entity.Vol;
@Repository
public interface VolRepository extends JpaRepository<Vol,Integer> {
}
