package Collection.List;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SetTest {
    @Test
    public void testSet() {
        Set<Integer> set = new HashSet();
        set.add(2);
        set.add(12);
        set.add(6);
        set.add(2);
       // System.out.println(set);
        Iterator iterator= set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Set set1 =new HashSet();
        set1.addAll(set);
        set1.remove(2);
        System.out.println(set1);

    }
}
