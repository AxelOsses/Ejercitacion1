package com.ejercicio.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.hospital.model.Paciente;
import com.ejercicio.hospital.service.PacienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("api/v1/pacientes")
public class PacienteController {
    @Autowired
    private PacienteService service;

    @GetMapping()
    public List<Paciente> obtenerTodos() {
        return service.findAll();
    }
    
    @PostMapping()
    public Paciente guardarNuevo(@RequestBody Paciente p) {      
        return service.save(p);
    }
    
}
