package dio.digitalinnovation.labPadroesProjetoSpringDesafio.controller;

import dio.digitalinnovation.labPadroesProjetoSpringDesafio.model.Client;
import dio.digitalinnovation.labPadroesProjetoSpringDesafio.model.Book;
import dio.digitalinnovation.labPadroesProjetoSpringDesafio.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/clientes")
public class ClientRestController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<Iterable<Client>> finAll(){
        return ResponseEntity.ok(clientService.findAll());
    }

    @GetMapping("/id")
    public ResponseEntity<Client> findById(@PathVariable Long id){
        return ResponseEntity.ok(clientService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Client> insert(@RequestBody Client client, ArrayList<Book> book){
        clientService.insert(client, book);
        return ResponseEntity.ok(client);
    }

    @DeleteMapping("/id")
    public ResponseEntity<Long> delete(@PathVariable Long id){
        clientService.delete(id);
       return ResponseEntity.ok(id);
    }



}
