/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.biketrotter.modules.icedynam.model;

import java.util.List;

/**
 *
 * @author Enea
 */
public class PropertyType {
    Integer id;
    String name;
    List<Property> properties;

    public PropertyType(String name, List<Property> properties) {
        this.name = name;
        this.properties = properties;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
    
    
    
}
