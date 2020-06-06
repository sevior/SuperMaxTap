package model;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author erasmo
 */
@Entity

public class Gerente extends Pessoa {

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matricula =+ Calendar.getInstance().get(Calendar.YEAR);

    @Column
    private String nick;

    @Column
    private String senha;
    
    @Column
    private BigInteger salario;

    public Gerente() {
    }

    public BigInteger getSalario() {
        return salario;
    }

    
    
    public int getMatricula() {
        return matricula;
    }

    public String getNick() {
        return nick;
    }

    public String getSenha() {
        return senha;
    }

    public Gerente(String nick, String senha, BigInteger salario, String primeiroNome, String segundoNome, String idade, String cpf, Contato contatos, Endereco endereco) {
        super(primeiroNome, segundoNome, idade, cpf, contatos, endereco);
        this.nick = nick;
        this.senha = senha;
        this.salario = salario;
    }

   

}
