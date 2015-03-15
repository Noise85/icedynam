/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.iceage.icedynam;

import ch.iceage.icedynam.exception.ValidationException;
import ch.iceage.icedynam.validation.AlphanumericValidator;
import ch.iceage.icedynam.validation.IntegerValidator;
import ch.iceage.icedynam.validation.ValidationRule;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Enea
 */
public class IcedynamTests {
    
    public IcedynamTests() {
    }
    
    class Document extends Entity {

        public Document(EntityType type) {
            super(type);
        }
        
        private Long id;
        private String code;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }
        
    }
    
    @Test
    public void testSuite1() {
        EntityType documentType = new EntityType("document");
        PropertyType string = new PropertyType("String");
        PropertyType number = new PropertyType("Number");
        ValidationRule alphaNumericValidator = new AlphanumericValidator(string);
        ValidationRule numberValidator = new IntegerValidator(number);
        Document document = new Document(documentType);
        document.setId(1L);
        document.setCode("1212-DDF3-3");
        try {
            document.add(new Property(string, "assuranceNumber", "A3844E4"));
            document.add(new Property(number, "clientId", "23454543"));
        } catch (ValidationException ex) {
            Logger.getLogger(IcedynamTests.class.getName()).log(Level.SEVERE, null, ex);
            fail();
        }
        
        System.out.println("Id: "+document.getId());
        System.out.println("Code: "+document.getCode());
        for(Property p :document.getProperties()) {
            System.out.println(p.getType().getName()+ " : " + p.getName() + ": "+p.getValue());
        }
        
    }
    
}
