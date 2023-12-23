package com.api3wings.apirest3wings.Entidade;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.api3wings.apirest3wings.database.RepositorioItem;

import jakarta.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/item")
public class ItemRest {
    @Autowired
    private RepositorioItem repositorio;

    @GetMapping
    public List<Item>listar(){
        return repositorio.findAll();
    }

    @GetMapping("/{id}")
    public Item getId(@PathVariable Long id){
     System.out.println(id);
        return repositorio.findById(id).orElse(null);
    }
    @PostMapping
    public void salvar(@RequestBody Item item){
        repositorio.save(item);
    }
    @PutMapping
    public void alterar(@RequestBody Item item){
        if(item.getId() > 0)
        repositorio.save(item);
    }
    @DeleteMapping
    public void excluir(@RequestBody Item item){
        repositorio.delete(item);
    }

}
