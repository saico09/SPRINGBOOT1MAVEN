
package com.backend.ejemplo01.controllers;

import com.backend.ejemplo01.models.entity.Persona;
import com.backend.ejemplo01.models.services.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200",maxAge=3600)
@RestController
@RequestMapping({"/personas"})
public class Controlador {
    
    @Autowired
    private PersonaService service;

    @GetMapping
    public List<Persona>listar(){
        return service.listar();
    }
    
}
