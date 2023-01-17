
package com.backend.ejemplo01.models.services;

import com.backend.ejemplo01.models.entity.Persona;
import java.util.List;

public interface PersonaService {
    List<Persona>listar();
    Persona listarId(int id);
    Persona add(Persona p);
    Persona edit(Persona p);
    Persona delete(int id);
}
