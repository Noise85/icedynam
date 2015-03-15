/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.iceage.icedynam;

import ch.iceage.icedynam.exception.ValidationException;

/**
 *
 * @author Enea
 */
public class Property {
    private Entity entity;
    private PropertyType type;
    private String name;
    private String value;

    /**
     * 
     * @param type
     * @param name
     * @param value 
     * @throws ch.iceage.icedynam.exception.ValidationException 
     */
    public Property(PropertyType type, String name, String value) throws ValidationException {
        this.entity = null;
        this.type = type;
        this.name=name;
        this.setValue(value);
    }

    public Property() throws ValidationException {
        this(null, null, "");
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public PropertyType getType() {
        return type;
    }

    public void setType(PropertyType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public final void setValue(String value) throws ValidationException {
        if(this.type!=null && this.type.getValidationRule() != null
                && value!=null && this.isValid(value)) {
            this.value=value;
        } else {
            throw new ValidationException(name, value);
        }
    }
    
    private Boolean isValid(String value) {
        return this.getType().getValidationRule().validate(value);
    }
    
}
