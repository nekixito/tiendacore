package com.nekixito.tienda.tiendacore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoRestController {

    @GetMapping("/hola")
    public String saludo(){
        return "Hola mundo desde controller";
    }
}
