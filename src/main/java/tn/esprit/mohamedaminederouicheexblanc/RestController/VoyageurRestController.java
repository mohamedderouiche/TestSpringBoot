package tn.esprit.mohamedaminederouicheexblanc.RestController;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;
import tn.esprit.mohamedaminederouicheexblanc.Services.IServiceVoyageur;
import tn.esprit.mohamedaminederouicheexblanc.entity.Voyageur;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/voyageur")
public class VoyageurRestController {
    IServiceVoyageur iServiceVoyageur;
    public List<Voyageur> AddALLVoyageurs(@RequestBody List<Voyageur> v){
        return iServiceVoyageur.ajouterVoyageurs(v);
    }
}
