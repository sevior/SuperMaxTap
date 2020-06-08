package model;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 *
 * @author erasmo
 */

@Entity

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String descricao;
    @Column
    private String nome;
    @Column
    private BigInteger preco;
    @Column
    private int tempoGarantia;
    @ManyToOne()
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;
    @ManyToOne()
    @JoinColumn(name = "fabricante_cnpj")
    private Fabricante fabricante;

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
    
    

    public String getNome() {
        return nome;
    }

    public BigInteger getPreco() {
        return preco;
    }

    public int getTempoGarantia() {
        return tempoGarantia;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public Produto() {
    }

    public Produto(String descricao,String nome, BigInteger preco, int tempoGarantia, Categoria categoria, Fabricante fabricante) {
        this.nome = nome;
        this.preco = preco;
        this.tempoGarantia = tempoGarantia;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return nome; //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
