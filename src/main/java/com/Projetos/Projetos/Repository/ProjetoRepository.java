package com.Projetos.Projetos.Repository;

import com.Projetos.Projetos.Entity.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}