package org.hameister.filmwatcher.nested;

import org.springframework.data.annotation.Id;

import java.util.HashMap;
import java.util.Map;

public class Entity2 {
    @Id
    long id;
    String name2;

    Map<String,Entity3> map = new HashMap<>();

    public Entity2() {
    }

    public Entity2(String name2) {
        this.name2 = name2;
    }

    public void  addElement(Entity3 entity3) {
       map.put(entity3.name3, entity3);
    }

    public void setId(Long id) {
        this.id = id;
    }
}
