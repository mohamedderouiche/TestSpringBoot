package tn.esprit.mohamedaminederouicheexblanc.Services;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.mohamedaminederouicheexblanc.entity.ClassPlace;
import tn.esprit.mohamedaminederouicheexblanc.entity.EtatReservation;
import tn.esprit.mohamedaminederouicheexblanc.entity.Repository.ReservationRepository;
import tn.esprit.mohamedaminederouicheexblanc.entity.Repository.VolRepository;
import tn.esprit.mohamedaminederouicheexblanc.entity.Reservation;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ServiceReservation implements IServiceReservation{
    ReservationRepository reservationRepository;
    VolRepository volRepository;
    @Override
    public String reserverVol(int voyageurId, int volId, ClassPlace classPlace) {
        String id;
        Reservation r;

        volRepository.findById(volId).get();

        return null;
    }

    @Override
    public Reservation confirmerReservation(String resId) {
        Reservation r=reservationRepository.findById(resId).get();
        r.setEtatReservation(EtatReservation.CONFIRMEE);
        return r;
    }

    @Override
    public void annulerReservation() {

    }
}
