package com.esteban.practica_cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hola desde practica-cicd";
    }

    @GetMapping("/listado")
    public String listado() {
        return "Hola desde listado";
    }

    @GetMapping("/persona")
    public String persona() {
        return "Hola persona endpoint";
    }

    @GetMapping("/persona2")
    public String persona2() {
        return "Hola persona2 endpoint";
    }

    @GetMapping("/persona3")
    public String persona3() {
        return "Hola persona3 endpoint";
    }

    @GetMapping("/persona4")
    public String persona4() {
        return "Hola persona4 endpoint";
    }

}
