package model;

import java.math.BigInteger;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Funcionario extends Pessoa {
    
  

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matricula;

    @Column
    private String senha;
    
    @Column
    private BigInteger salario;

    public int getMatricula() {
        return matricula;
    }

    public String getSenha() {
        return senha;
    }

    public BigInteger getSalario() {
        return salario;
    }
    
    

    public Funcionario() {
    }

    public Funcionario(String senha, BigInteger salario, String primeiroNome, String segundoNome, String idade, String cpf, Contato contatos, Endereco endereco) {
        super(primeiroNome, segundoNome, idade, cpf, contatos, endereco);
        this.senha = senha;
        this.salario = salario;
    }

    
    
    

}
