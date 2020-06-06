package model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

/**
 *
 * @author erasmo
 */
@MappedSuperclass
public class Pessoa {

    @Column
    private String primeiroNome;
    @Column
    private String segundoNome;
    @Column
    private String idade;
    @Column
    private String cpf;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private Contato contatos;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private Endereco endereco;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public String getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public Contato getContatos() {
        return contatos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Pessoa() {
    }

    public Pessoa(String primeiroNome, String segundoNome, String idade, String cpf, Contato contatos, Endereco endereco) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.idade = idade;
        this.cpf = cpf;
        this.contatos = contatos;
        this.endereco = endereco;
    }

}
