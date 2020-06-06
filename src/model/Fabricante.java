package model;




import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;


/**
 *
 * @author erasmo
 */
@Entity

public class Fabricante {

    @Column
    private String nome;
    @Id
    @Column
    private String cnpj;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn
    private Contato contato;
   

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Contato getContato() {
        return contato;
    }


    public Fabricante() {
    }
      
    public Fabricante(String nome, String cnpj, Contato contato) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contato = contato;
       
    }

    @Override
    public String toString() {
        return nome;
    }
    
    

}
