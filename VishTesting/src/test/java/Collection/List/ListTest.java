package Collection.List;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    @Test
    public void addToList() {
        List list=new ArrayList();
        list.add(2);
        list.add("avinash");
        list.add(1,"vish");
        System.out.println(list);
        List list1=new ArrayList();
        System.out.println("after adding list to list1->"+list1.addAll(list));
        list1.add("vish");
        list1.remove(2);
        System.out.println(list1);
        System.out.println(list.containsAll(list1));
        Iterator iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
