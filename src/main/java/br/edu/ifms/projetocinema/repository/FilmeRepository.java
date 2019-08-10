package br.edu.ifms.projetocinema.repository;

import br.edu.ifms.projetocinema.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {}
