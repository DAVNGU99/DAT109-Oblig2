package com.example.dat109oblig2.Controller;

import com.example.dat109oblig2.Objekter.Bil;
import com.example.dat109oblig2.Objekter.Billister;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

}
