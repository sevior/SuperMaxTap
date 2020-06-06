package model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author erasmo
 */

@Entity

public class Cliente extends Pessoa {

    @Id
    @Column
    private String email;

    @Column
    private String senha;

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public Cliente() {
    }

    public Cliente(String email, String senha,String primeiroNome, String segundoNome, String idade, String cpf, Contato contatos, Endereco endereco) {
        super(primeiroNome, segundoNome, idade, cpf, contatos, endereco);
        this.email = email;
        this.senha = senha;
    }

}
