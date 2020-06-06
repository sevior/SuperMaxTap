/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlView;

/**
 *
 * @author erasmo
 */
public class Control {

    public boolean cliente(String email, String senha, String primeiroNome, String segundoNome, String idade, String cpf, String numTelefone, String rua, String numero, String bairro, String cidade, String uf) {
        if (cpf.isEmpty() || numTelefone.isEmpty() || rua.isEmpty() || bairro.isEmpty() || cidade.isEmpty() || uf.isEmpty() || numero.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean fabricante(String email, String cnpj, String nome, String numTelefone) {
        if (numTelefone.isEmpty() || numTelefone.isEmpty() || email.isEmpty() || nome.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean categoria(String categoria) {
        if (categoria.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean funcionario(String senha, String primeiroNome, String segundoNome, String idade, String cpf, String email, String numTelefone, String rua, String numero, String bairro, String cidade, String uf, String salario) {
        if (cpf.isEmpty() || numTelefone.isEmpty() || rua.isEmpty() || bairro.isEmpty() || cidade.isEmpty() || uf.isEmpty() || numero.isEmpty() || salario.isEmpty()) {
            return true;
        }
        return false;
    }
    
      public boolean gerente(String nick,String senha, String primeiroNome, String segundoNome, String idade, String cpf, String email, String numTelefone, String rua, String numero, String bairro, String cidade, String uf, String salario) {
        if (cpf.isEmpty() || numTelefone.isEmpty() || rua.isEmpty() || bairro.isEmpty() || cidade.isEmpty() || uf.isEmpty() || numero.isEmpty() || salario.isEmpty() || nick.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean produto(String descricao, String nomeProduto, String preco, String garantia) {
        if (descricao.isEmpty() || nomeProduto.isEmpty() || preco.isEmpty() || garantia.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
