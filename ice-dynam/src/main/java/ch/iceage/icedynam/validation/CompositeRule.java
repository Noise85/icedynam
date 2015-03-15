/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.iceage.icedynam.validation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Enea
 */
public final class CompositeRule implements ValidationRule {
    
    private List<ValidationRule> rules;

    public CompositeRule() {
        this.rules=new ArrayList<>();
    }

    @Override
    public Boolean validate(String value) {
        Iterator<ValidationRule> ruleIterator = rules.iterator();
        Boolean isValid = false;
        while(ruleIterator.hasNext() && isValid.equals(false)) {
            ValidationRule rule = ruleIterator.next();
            isValid=rule.validate(value);
        }
        return isValid;
    }

    public boolean add(ValidationRule e) {
        return rules.add(e);
    }

    public boolean remove(ValidationRule o) {
        return rules.remove(o);
    }
    
}
