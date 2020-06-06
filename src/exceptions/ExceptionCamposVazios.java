/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author erasmo
 */
public class ExceptionCamposVazios extends Exception {

    public ExceptionCamposVazios() {

    }

    @Override
    public String toString() {
        return "Todos os campos precisão ser preenchidos corretamente";
    }

}
