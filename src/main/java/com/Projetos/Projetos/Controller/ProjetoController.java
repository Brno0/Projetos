package com.Projetos.Projetos.Controller;

import com.Projetos.Projetos.Entity.Projeto;
import com.Projetos.Projetos.Service.ProjetoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projetos")
public class ProjetoController {

    private final ProjetoService service;

    public ProjetoController(ProjetoService service) {
        this.service = service;
    }

    @PostMapping
    public Projeto criar(@RequestBody Projeto projeto) {
        return service.salvar(projeto);
    }

    @GetMapping
    public List<Projeto> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Projeto buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
