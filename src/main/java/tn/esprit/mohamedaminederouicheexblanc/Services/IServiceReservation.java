package tn.esprit.mohamedaminederouicheexblanc.Services;

import tn.esprit.mohamedaminederouicheexblanc.entity.ClassPlace;
import tn.esprit.mohamedaminederouicheexblanc.entity.Reservation;

public interface IServiceReservation {
    String reserverVol(int voyageurId, int volId, ClassPlace classPlace);
    Reservation confirmerReservation(String resId);
    void annulerReservation();
}
