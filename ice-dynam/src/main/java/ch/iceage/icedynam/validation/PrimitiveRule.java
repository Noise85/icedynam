/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.iceage.icedynam.validation;

import ch.iceage.icedynam.PropertyType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Enea
 */
public abstract class PrimitiveRule implements ValidationRule {
    
    protected Long id;
    protected String regex;
    protected PropertyType type;

    public PrimitiveRule(PropertyType type, String regex) {
        this.id = null;
        this.regex = regex;
        this.setType(type);
    }

    public PrimitiveRule(String regex) {
        this(null, regex);
    }

    public PrimitiveRule() {
        this(null,null);
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }

    public PropertyType getType() {
        return type;
    }

    public final void setType(PropertyType type) {
        this.type = type;
        this.type.setValidationRule(this);
    }

    @Override
    public Boolean validate(String value) {
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(value);
        return matcher.matches();
    }
    
}
