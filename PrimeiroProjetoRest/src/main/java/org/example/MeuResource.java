package org.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class MeuResource {

//    @RequestMapping(value = "/api/clientes/{id}", method = RequestMethod.GET)

    @GetMapping("{id}")
    public Cliente obterDadosCliente(@PathVariable Long id) {
        System.out.println(String.format("Id recebido via url: %d", id));
        Cliente cliente = new Cliente("Donizete", "000.000.000-20");
        return  cliente;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public  ResponseEntity salvar(@RequestBody Cliente cliente){
        return new ResponseEntity(cliente, HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Cliente delete(@PathVariable Long id, Cliente cliente){
        return  cliente;
    }

    @PutMapping("{id}")
    public  Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        return  cliente;
    }
}
