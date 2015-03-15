/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.iceage.icedynam;

import ch.iceage.icedynam.validation.ValidationRule;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Enea
 */
public class PropertyType<T> {
    private String name;
    private List<Property> properties;
    private Class<T> type; 
    private ValidationRule validationRule;

    public PropertyType(String typeName) {
        this.name=typeName;
        this.properties= new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Property> getPropertyTypes() {
        return properties;
    }

    public boolean contains(Property o) {
        return properties.contains(o);
    }

    public boolean add(Property e) {
        return properties.add(e);
    }

    public boolean remove(Property o) {
        return properties.remove(o);
    }

    public ValidationRule getValidationRule() {
        return validationRule;
    }

    public void setValidationRule(ValidationRule validationRule) {
        this.validationRule = validationRule;
    }

    public List<Property> getProperties() {
        return properties;
    }
    
}
