package com.example.dat109oblig2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hjemmeside {


    @GetMapping("/hjemmeside")
    public String hjemmeside(){

        return "hjemmeside";

    }


    @GetMapping("/skjema")
    public String skjema(){
        return "skjema";
    }


}
