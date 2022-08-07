package ComparableInterface;

public class Employee implements Comparable<Employee> {
    String name;
    String company;
    int sal;
    public Employee(String name, String company,int sal){
        this.name=name;
        this.company=company;
        this.sal=sal;
    }

    @Override
    public int compareTo(Employee e) {
        if(this.sal>e.sal){
            return 1;
        }
        else if(this.sal<e.sal)
        return -1;
        else return 0;
    }
}
