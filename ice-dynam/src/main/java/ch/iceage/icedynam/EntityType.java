/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.iceage.icedynam;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Enea
 */
public class EntityType {
    private String name;
    private List<Entity> entities;

    public EntityType(String name) {
        this.name = name;
        this.entities=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean contains(Entity o) {
        return entities.contains(o);
    }

    public boolean add(Entity e) {
        e.setType(this);
        return entities.add(e);
    }

    public boolean remove(Entity o) {
        return entities.remove(o);
    }

    public List<Entity> getEntities() {
        return entities;
    }
    
}
