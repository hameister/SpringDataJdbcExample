package org.hameister.nested;

import org.springframework.data.annotation.Id;

public class Entity3 {

    @Id
    long id;
    String name3;

    public Entity3(String name3) {
        this.name3 = name3;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
