package br.com.api.estudo.service;

import br.com.api.estudo.model.Funcionario;
import br.com.api.estudo.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    private final FuncionarioRepository repository;

    @Autowired
    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }
    public List<Funcionario> buscarFuncionario() {
        return repository.findAll();
    }

    public void createdFuncionario(Funcionario funcionario) {
        Optional<Funcionario> consulta = repository.findFuncionarioByEmail(funcionario.getEmail());
        if(consulta.isPresent()) {
            throw new IllegalStateException("Email ja possui cadastro");
        }
        repository.save(funcionario);
    }
}
