package org.hameister.nested;

import org.hameister.nested.Entity1;
import org.hameister.nested.Entity2;
import org.hameister.nested.Entity3;
import org.hameister.nested.Repository1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJdbcTest
public class NestedTest {

    @Autowired
    Repository1 repository1;

    @Test
    public void testA() {

        Entity1 entity1 = new Entity1("Entity1");
        Entity2 entity2 = new Entity2("Entity2");
        Entity3 entity3 = new Entity3("Entity3");
        entity1.addElement(entity2);
     //   entity2.addElement(entity3);
        repository1.save(entity1);


    }
}
