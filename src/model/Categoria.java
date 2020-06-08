package model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author erasmo
 */

@Entity

public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nomeCategoria;

    public int getId() {
        return id;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public Categoria() {

    }

    public Categoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
    
    
    
    @Override
    public String toString() {
        return nomeCategoria;
    }

}
