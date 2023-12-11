package tn.esprit.mohamedaminederouicheexblanc.RestController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.mohamedaminederouicheexblanc.Services.IServices;
import tn.esprit.mohamedaminederouicheexblanc.entity.Vol;

@RestController
@AllArgsConstructor
@RequestMapping("/vol")
public class VolRestController {
    IServices iServices;
    @PostMapping("addVolAndAeroport")
    public String addVolandAeroport(@RequestBody Vol vol){
        return iServices.ajouterVolEtAeroport(vol);
    }
}
