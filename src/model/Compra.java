package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

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


    @OneToOne
    @JoinColumn
    private ModoCompra modo;
    
    

    public ModoCompra getModo() {
        return modo;
    }

    public int getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public Cliente getCliente() {
        return cliente;
    }


    public Compra() {
    }

    public Compra(Produto produto, Cliente cliente, ModoCompra modo) {
        this.produto = produto;
        this.cliente = cliente;
        this.modo = modo;

    }

}
