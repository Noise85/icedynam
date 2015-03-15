/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.iceage.icedynam;

import java.util.List;

/**
 * This interface is meant to define the basic functionalities
 * of the Dynamic Attribute Management library.
 * Every business class that wants to implement the Adaptive Object Model
 * has to implement this interface.
 * @author Enea
 */
public interface DynamicEntity {
    
    /**
     * Dinamically adds a property to the object model
     * @param e
     * @return 
     */
    boolean add(Property e);
    /**
     * Determines if a property is already defined for the current object
     * @param o
     * @return 
     */
    boolean contains(Property o);
    /**
     * Get all properties defined for this object
     * @return 
     */
    List<Property> getProperties();
    /**
     * Gets the object type.
     * @return 
     */
    EntityType getType();
    /**
     * Removes a property from the current object
     * @param o
     * @return 
     */
    boolean remove(Property o);
    /**
     * Sets the type of the current object
     * @param type 
     */
    void setType(EntityType type);
    
}
