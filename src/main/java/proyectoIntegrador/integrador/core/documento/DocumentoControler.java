package proyectoIntegrador.integrador.core.documento;

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
@RequestMapping("api/documento")
@CrossOrigin({"*"})


public class DocumentoControler {
    
    @Autowired 
    private DocumentoService documentoService;

    //Visualizar todos los documentos
    @GetMapping("/")
   
    public List<Documento> findAll(){
        return documentoService.findAll();
    }

    //Crear Documento
    @PostMapping("/")

    public Documento save(@RequestBody Documento entity){
        return documentoService.save(entity);

    }

    //Visualizar docmento por su Id
    @GetMapping("/{id}/")

    public Documento findById(@PathVariable long id){
        return documentoService.findById(id);
    }

   
    //Actualizar documento
    @PutMapping("/")
  
    public Documento update(@RequestBody Documento entity){
        return documentoService.save(entity);
    }

    //Eliminar documento por su Id
    @DeleteMapping("/{id}/")
   
    public void deleteById(@PathVariable long id){
        documentoService.deleteById(id);
    }

}