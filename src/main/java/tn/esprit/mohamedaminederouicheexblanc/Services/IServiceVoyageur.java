package tn.esprit.mohamedaminederouicheexblanc.Services;

import tn.esprit.mohamedaminederouicheexblanc.entity.Voyageur;

import java.util.List;
import java.util.Map;

public interface IServiceVoyageur {
    List<Voyageur>ajouterVoyageurs(List<Voyageur> voyageurs);
    Map<Integer,List<Voyageur>> getVoyageurByVol();
}
