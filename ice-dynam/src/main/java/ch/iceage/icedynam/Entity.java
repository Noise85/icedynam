/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.iceage.icedynam;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is the entry point for the Adaptive Model.
 * Extend this class to enable the child class with the Adaptive Model.
 * @author Enea
 */
public class Entity implements DynamicEntity {
    private EntityType type;
    private List<Property> properties;

    public Entity(EntityType type) {
        this.type = type;
        this.properties=new ArrayList<>();
    }

    @Override
    public EntityType getType() {
        return type;
    }

    @Override
    public void setType(EntityType type) {
        this.type = type;
    }

    @Override
    public List<Property> getProperties() {
        return properties;
    }

    @Override
    public boolean contains(Property o) {
        return properties.contains(o);
    }

    @Override
    public boolean add(Property e) {
        e.setEntity(this);
        return properties.add(e);
    }

    @Override
    public boolean remove(Property o) {
        return properties.remove(o);
    }
    
}
