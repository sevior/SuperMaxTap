/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Erasmo
 */
public class ExceptionJaCadastrado extends Exception {

    private String msg;
    
    public ExceptionJaCadastrado(String mesg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg+" já está cadastrado no sistema";
    }

}
