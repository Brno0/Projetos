package com.Projetos.Projetos.Service;

import com.Projetos.Projetos.Entity.Projeto;
import com.Projetos.Projetos.Repository.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    private final ProjetoRepository repository;

    public ProjetoService(ProjetoRepository repository) {
        this.repository = repository;
    }

    public Projeto salvar(Projeto projeto) {
        return repository.save(projeto);
    }

    public List<Projeto> listarTodos() {
        return repository.findAll();
    }

    public Projeto buscarPorId(Long id) {
        Optional<Projeto> projeto = repository.findById(id);
        return projeto.orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
