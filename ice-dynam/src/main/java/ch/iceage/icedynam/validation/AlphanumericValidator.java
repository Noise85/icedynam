/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.iceage.icedynam.validation;

import ch.iceage.icedynam.PropertyType;

/**
 *
 * @author Enea
 */
public class AlphanumericValidator extends PrimitiveRule {
    
    private static final String pattern = "[a-zA-Z0-9]*";
    
    public AlphanumericValidator(PropertyType type) {
        super(type, pattern);
    }
}
