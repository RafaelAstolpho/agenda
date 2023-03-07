package com.api.agenda;

import com.api.agenda.database.RepositorioContato;
import com.api.agenda.entidade.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping ("/contato")
public class ContatoREST {
    @Autowired /* Spring cria o obejto e inejta no atributo (repositorio), tendo esse objeto todas as operações basicas para manipular o contato no BD*/
    private RepositorioContato repositorio;
    @GetMapping
    public List <Contato> consultar (){
        return repositorio.findAll();
    }
    @PostMapping
    public void salvar (@RequestBody Contato contato){
        repositorio.save(contato);
    }
    @PutMapping
    public void alterar (@RequestBody Contato contato){
        if (contato.getId() > 0)
        repositorio.save(contato);
    }
    @DeleteMapping
    public void excluir (@RequestBody Contato contato){
        repositorio.delete(contato);
    }

}
