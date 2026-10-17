package com.esteban.practica_cicd.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    @Test
    void helloDevuelveSaludo() {
        assertEquals("Hola desde practica-cicd", new HelloController().hello());
    }
}
