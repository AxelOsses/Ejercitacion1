package com.ejercicio.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.hospital.model.Ficha;
import com.ejercicio.hospital.service.FichaService;


@RestController
@RequestMapping("api/v1/fichas")
public class FichaController {
    @Autowired
    private FichaService service;

    @GetMapping("{id}")
    public Ficha getMethodName(@PathVariable("id") Long numero) {
        return service.getFicha(numero);
    }

}
