package proyectoIntegrador.integrador.core.programa;

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
@RequestMapping("api/programa")
@CrossOrigin({"*"})

public class ProgramaControler {
    
    @Autowired 
    private ProgramaService programaService;


    //visualizar todos los programas
    @GetMapping("/")
  
    public List<Programa> findAll(){
        return programaService.findAll();
    }
    //Crear programa
    @PostMapping("/")
 
    public Programa save(@RequestBody Programa entity){
        return programaService.save(entity);

    }
    //visualizar programa por Id
    @GetMapping("/{id}/")
   
    public Programa findById(@PathVariable long id){
        return programaService.findById(id);
    }

    //Actualizar programa
    @PutMapping("/")
    
    public Programa update(@RequestBody Programa entity){
        return programaService.save(entity);
    }
    //Borrar programa por Id
    @DeleteMapping("/{id}/")
    
    public void deleteById(@PathVariable long id){
        programaService.deleteById(id);
    }

}
