package br.edu.ifms.projetocinema.repository;


import br.edu.ifms.projetocinema.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
