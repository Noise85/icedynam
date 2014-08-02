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
public class AccountType {
    
    Integer id;
    String code;
    String description;
    List<PropertyType> properties;

    public AccountType(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PropertyType> getProperties() {
        return properties;
    }

    public void setProperties(List<PropertyType> properties) {
        this.properties = properties;
    }
    
}
