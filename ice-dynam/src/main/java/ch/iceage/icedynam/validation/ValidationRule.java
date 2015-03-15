/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.iceage.icedynam.validation;

/**
 *
 * @author Enea
 */
public interface ValidationRule {
    
    /**
     * Validates the value given the string value
     * @param value
     * @return 
     */
    public Boolean validate(String value);
}
