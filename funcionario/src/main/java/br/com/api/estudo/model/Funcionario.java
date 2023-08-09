package br.com.api.estudo.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "funcionarios")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFUncionario;
    private String nome;
    @Transient
    private Integer idade;
    private String email;
    private LocalDate dataNascimento;
    private LocalDate dataContratacao;

    public Funcionario(Long idFUncionario ,String nome, String email, LocalDate dataNascimento, LocalDate dataContratacao) {
        this.idFUncionario = idFUncionario;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao;
    }

    public Funcionario() {

    }
    public Long getIdFUncionario() {
        return idFUncionario;
    }
    public void setIdFUncionario(Long idFUncionario) {
        this.idFUncionario = idFUncionario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public LocalDate getDataContratacao() {
        return dataContratacao;
    }
    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

}
