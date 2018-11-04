package org.hameister.nested;

import org.springframework.data.annotation.Id;

import java.util.HashMap;
import java.util.Map;

public class Entity1 {
    @Id
    long id;

    String name1;

    Map<String, Entity2> bMap = new HashMap<>();

    public Entity1() {
    }

    public Entity1(String name1) {
        this.name1 = name1;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public  void  addElement(Entity2 entity2) {
        bMap.put(entity2.name2, entity2);
    }

}
