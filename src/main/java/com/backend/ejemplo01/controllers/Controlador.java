
package com.backend.ejemplo01.controllers;

import com.backend.ejemplo01.models.entity.Persona;
import com.backend.ejemplo01.models.services.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="*",maxAge=3600)// * porque es de prueba; en caso de produccion se agrega otro cors con el 8080 (ej)
@RestController
@RequestMapping({"/personas"})
public class Controlador {
    
    @Autowired
    private PersonaService service;

    @GetMapping
    public List<Persona>listar(){
        return service.listar();
    }
    
    @PostMapping
    public Persona agregar(@RequestBody Persona p){
        return service.add(p);
    }
    
    //BUSCAR POR ID
    @GetMapping(path={"/{id}"})
    public Persona listarId(@PathVariable("id") int id){
        return service.listarId(id);
    }
    
    @PutMapping(path={"/{id}"})
    public Persona editar(@RequestBody Persona p,@PathVariable("id") int id){
        p.setId(id);
        return service.edit(p);
    }
    
    @DeleteMapping(path={"/{id}"})
    public Persona delete(@PathVariable("id") int id){
        return service.delete(id);
    }
}

