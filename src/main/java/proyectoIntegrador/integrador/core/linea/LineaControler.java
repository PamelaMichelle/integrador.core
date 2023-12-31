package proyectoIntegrador.integrador.core.linea;

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
@RequestMapping("api/linea")
@CrossOrigin({"*"})


public class LineaControler {
    
    @Autowired 
    private LineaService lineaService;

    //Visualizar todas las lineas
    @GetMapping("/")
  
    public List<Linea> findAll(){
        return lineaService.findAll();
    }
    //Crear Linea 
    @PostMapping("/")
  
    public Linea save(@RequestBody Linea entity){
        return lineaService.save(entity);

    }
    //Visualizar linea por su Id
    @GetMapping("/{id}/")
    
    public Linea findById(@PathVariable long id){
        return lineaService.findById(id);
    }

    
    //Actualizar linea
    @PutMapping("/")
    
    public Linea update(@RequestBody Linea entity){
        return lineaService.save(entity);
    }

    //Eliminar linea por su Id
    @DeleteMapping("/{id}/")
  
    public void deleteById(@PathVariable long id){
        lineaService.deleteById(id);
    }

}
