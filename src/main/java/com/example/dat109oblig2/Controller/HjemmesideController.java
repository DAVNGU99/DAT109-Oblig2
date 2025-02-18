package com.example.dat109oblig2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Klasse for å sette opp hjemmesiden og listing av prisene til biltypene.
 * @author Gruppe 29
 */
@Controller
public class HjemmesideController {


    @GetMapping("/")
    public String hjemmeside(){

        return "hjemmeside";

    }


    @GetMapping("/priser")
    public String priser(){

        return "priser";

    }




}
