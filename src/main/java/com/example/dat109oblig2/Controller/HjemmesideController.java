package com.example.dat109oblig2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
