/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.iceage.icedynam.exception;

/**
 *
 * @author Enea
 */
public class ValidationException extends Exception {

    public ValidationException(String value) {
        super(value);
    }

    public ValidationException(String name, String value) {
        super(name + " : " + value);
    }
    
}
