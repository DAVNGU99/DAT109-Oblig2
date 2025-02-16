package com.example.dat109oblig2.Controller;

import com.example.dat109oblig2.Objekter.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class BestillingController {


    @GetMapping("/bestilling")
    public String bestilling(@RequestParam(value = "bilId", required = true) String bilId,
                            Model model) {

        List<Bil> alleBiler = List.of(
                Billister.osloBiler,
                Billister.bergenBiler,
                Billister.haugesundBiler,
                Billister.kristiansandBiler,
                Billister.stavangerBiler
        ).stream().flatMap(List::stream).toList();


        Bil valgtBil = alleBiler.stream()
                .filter(bil -> bil.getRegnr().equalsIgnoreCase(bilId))
                .findFirst()
                .orElse(null);


        model.addAttribute("bil", valgtBil);
        return "bestilling";
    }


    @PostMapping("/bestilling")
    public String lagreBestilling(
            @RequestParam("cc-nummer") String kredittkort,
            @RequestParam("regnr") String regnr,
            @RequestParam("utleieDato") String utleieDato,
            @RequestParam("returDato") String returDato,
            @RequestParam("fornavn") String fornavn,
            @RequestParam("etternavn") String etternavn,
            @RequestParam("telefonnummer") String telefonnummer,
            @RequestParam("adresse") String adresse,






            Model model){

        Kunde lagreKunde = new Kunde();
        lagreKunde.setFornavn(fornavn);
        lagreKunde.setEtternavn(etternavn);
        lagreKunde.setTelefonnummer(telefonnummer);
        lagreKunde.setAddresse(adresse);

        RegistrertKundeListe.kundeinformasjon.add(lagreKunde);



        Utleiebestilling bestilling = new Utleiebestilling();

        bestilling.setKredditkort(kredittkort);
        bestilling.setRegnr(regnr);
        bestilling.setUtleieDato(LocalDate.parse(utleieDato));
        bestilling.setReturDato(LocalDate.parse(returDato));

        UtleieBestillingsListe.bestilling.add(bestilling);

        model.addAttribute("bestilling", bestilling);

        return "ordreBekreftelse";





    }

}
