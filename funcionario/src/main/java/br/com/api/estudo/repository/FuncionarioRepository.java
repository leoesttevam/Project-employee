package br.com.api.estudo.repository;

import br.com.api.estudo.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    @Query("SELECT funcionario FROM Funcionario funcionario WHERE funcionario.email = ?1")
    Optional<Funcionario> findFuncionarioByEmail(String email);
}
