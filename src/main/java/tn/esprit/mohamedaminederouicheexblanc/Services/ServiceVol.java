package tn.esprit.mohamedaminederouicheexblanc.Services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.mohamedaminederouicheexblanc.entity.Repository.VolRepository;
import tn.esprit.mohamedaminederouicheexblanc.entity.Vol;
@Service
@AllArgsConstructor
@NoArgsConstructor
public class ServiceVol implements IServices{
    @Autowired
    VolRepository volRepository;
    @Override
    public String ajouterVolEtAeroport(Vol vol) {
        try {
          volRepository.save(vol);
            return "succès";
        } catch (Exception e) {
            return "Erreur : " + e.getMessage();
        }
    }
}
