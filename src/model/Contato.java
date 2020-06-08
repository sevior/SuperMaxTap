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

public class Contato{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String numTelefone;

    @Column
    private String email;

    public int getId() {
        return id;
    }

    public String getNumTelefone() {
        return numTelefone;
    }

    public String getEmail() {
        return email;
    }

    public Contato() {
    }

    public Contato(String numTelefone, String email) {
        this.numTelefone = numTelefone;
        this.email = email;
    }

}
