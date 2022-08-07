package ComparableInterface;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Base {
    @Test
    public void test(){
        List<Employee> list=new ArrayList();
        list.add(new Employee("Vish","HDFC",12));
        list.add(new Employee("Avinash","Infosys",25));
        list.add(new Employee("Takale","MasterCard",35));
        Collections.sort(list,Collections.reverseOrder());
        for (Employee e:list) {
            System.out.println(e.name+" "+e.company+" "+e.sal);

            break;
        }
    }
}
