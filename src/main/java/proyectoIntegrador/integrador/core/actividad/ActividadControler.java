package proyectoIntegrador.integrador.core.actividad;

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


@RestController
@RequestMapping("api/actividad")
@CrossOrigin({"*"})


public class ActividadControler {
    
    @Autowired 
    private ActividadService actividadService;

    //Visualizar todas las actividades
    @GetMapping("/")
   
    public List<Actividad> findAll(){
        return actividadService.findAll();
    }

    //Crear actividad
    @PostMapping("/")
 
    public Actividad save(@RequestBody Actividad entity){
        return actividadService.save(entity);

    }

    //Visualizar actividad por Id
    @GetMapping("/{id}/")
   
    public Actividad findById(@PathVariable long id){
        return actividadService.findById(id);
    }

    
    //Actualizar actividad
    @PutMapping("/")
  
    public Actividad update(@RequestBody Actividad entity){
        return actividadService.save(entity);
    }

    //Eliminar actividad por Id
    @DeleteMapping("/{id}/")

    public void deleteById(@PathVariable long id){
        actividadService.deleteById(id);
    }

}
