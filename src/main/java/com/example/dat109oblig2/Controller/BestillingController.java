package com.example.dat109oblig2.Controller;

import com.example.dat109oblig2.Objekter.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
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

        BigDecimal dagspris = valgtBil.getUtleiegruppe().dagsPris();
        model.addAttribute("dagspris", dagspris);


        model.addAttribute("bil", valgtBil);
        return "bestilling";
    }


    @PostMapping("/bestilling")
    public String lagreBestilling(

            //bestillingsdel
            @RequestParam("kredittkort") String kredittkort,
            @RequestParam("regnr") String regnr,
            @RequestParam("utleieDato") String utleieDato,
            @RequestParam("returDato") String returDato,

            //kundedel
            @RequestParam("fornavn") String fornavn,
            @RequestParam("etternavn") String etternavn,
            @RequestParam("telefonnummer") String telefonnummer,
            @RequestParam("adresse") String adresse,
            @RequestParam("poststed") String poststed,
            @RequestParam("postnummer") String postnummer,

            //Bil











            Model model){

        Kunde lagreKunde = new Kunde();
        lagreKunde.setFornavn(fornavn);
        lagreKunde.setEtternavn(etternavn);
        lagreKunde.setTelefonnummer(telefonnummer);
        lagreKunde.setAddresse(adresse);
        lagreKunde.setPoststed(poststed);
        lagreKunde.setPostnummer(Integer.parseInt(postnummer));

        RegistrertKundeListe.kundeinformasjon.add(lagreKunde);



        Utleiebestilling bestilling = new Utleiebestilling();

        bestilling.setKredittkort(kredittkort);
        bestilling.setRegnr(regnr);
        bestilling.setUtleieDato(LocalDate.parse(utleieDato));
        bestilling.setReturDato(LocalDate.parse(returDato));

        UtleieBestillingsListe.bestilling.add(bestilling);

        List<Bil> alleBiler = List.of(
                Billister.osloBiler,
                Billister.bergenBiler,
                Billister.haugesundBiler,
                Billister.kristiansandBiler,
                Billister.stavangerBiler
        ).stream().flatMap(List::stream).toList();


        Bil valgtBil = alleBiler.stream()
                .filter(bil -> bil.getRegnr().equalsIgnoreCase(regnr))
                .findFirst()
                .orElse(null);




        model.addAttribute("bestilling", bestilling);
        model.addAttribute("bil", valgtBil);
        model.addAttribute("kunde", lagreKunde);

        return "ordreBekreftelse";





    }

}
