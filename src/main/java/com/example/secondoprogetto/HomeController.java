package com.example.secondoprogetto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/")
    public String homepage() {
        String saluto = "Benvenuti nella homepage";
        return saluto;
    }

    @GetMapping("/annodinascita")
    public Integer annoDiNascita() {
        Integer annoCorrente = LocalDate.now().getYear();
        Integer annoNascita = 1997;
        Integer eta = annoCorrente - annoNascita;
        return eta;
    }
}
