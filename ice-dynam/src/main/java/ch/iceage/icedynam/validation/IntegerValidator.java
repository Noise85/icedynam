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
public class IntegerValidator extends PrimitiveRule {

    public IntegerValidator(PropertyType type) {
        super(type, "[0-9]+");
    }
    
}
