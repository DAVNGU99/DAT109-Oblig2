package com.example.dat109oblig2.Controller;

import com.example.dat109oblig2.Objekter.Bil;
import com.example.dat109oblig2.Objekter.Kontor;
import com.example.dat109oblig2.Objekter.Kontorliste;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class VelgKontorOgBilController {


    @GetMapping("/skjema")
    public String skjema(@RequestParam(value = "kontorID", required = false) Integer kontorID, Model model){


        if (kontorID == null) {
            model.addAttribute("kontorliste", Kontorliste.kontorliste);
            return "skjema";
        }


        Kontor valgtKontor = Kontorliste.kontorliste.stream()
                .filter(k -> k.getKontornr() == kontorID)
                .findFirst()
                .orElse(null);

        if (valgtKontor != null) {
            model.addAttribute("biler", valgtKontor.getBiler());
            return "listeAvBiler";
        } else {
            return "feilmelding";
        }
    }


}
