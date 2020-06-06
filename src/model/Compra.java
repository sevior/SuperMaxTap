package model;

import java.math.BigInteger;
import java.util.List;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author erasmo
 */
@Entity

public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JoinColumn
    private Produto produto;

    @ManyToOne
    @JoinColumn
    private Cliente cliente;

    @Column
    private BigInteger total;

    public int getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public BigInteger getTotal() {
        return total;
    }
    
    

    public Compra() {
    }

    public Compra(Produto produto, Cliente cliente, BigInteger total) {
        this.produto = produto;
        this.cliente = cliente;
        this.total = total;
    }

}
