package tn.esprit.mohamedaminederouicheexblanc.Services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.mohamedaminederouicheexblanc.entity.EtatReservation;
import tn.esprit.mohamedaminederouicheexblanc.entity.Repository.ReservationRepository;
import tn.esprit.mohamedaminederouicheexblanc.entity.Repository.VoyageurRepository;
import tn.esprit.mohamedaminederouicheexblanc.entity.Reservation;
import tn.esprit.mohamedaminederouicheexblanc.entity.Voyageur;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ServceVoyageurs implements IServiceVoyageur{
    @Autowired
    VoyageurRepository voyageurRepository;
    ReservationRepository reservationRepository;
    @Override
    public List<Voyageur> ajouterVoyageurs(List<Voyageur> voyageurs) {
        return voyageurRepository.saveAll(voyageurs);
    }

    @Override
    public Map<Integer, List<Voyageur>> getVoyageurByVol() {
        Date d=new Date();
        //List<Reservation> reservation=reservationRepository.findAll();
        for (Reservation r:reservationRepository.findAll()  )
        {
            if (r.getEtatReservation().equals(EtatReservation.CONFIRMEE)){

            }
        }
        return null;
    }
}
