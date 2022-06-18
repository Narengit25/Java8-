import java.util.ArrayList;
import java.util.List;

public class LambdaInCollections
{
    public static void main(String[] args) {

//        Employee e = new Employee("Naren",100);
//        System.out.println(e);

        List<Employee> al = new ArrayList<Employee>(List.of(new Employee("Naren", 100),
                new Employee("Harish", 103),
                new Employee("Subhash", 106),
                new Employee("Prakash", 110),
                new Employee("Latha", 99)));
        System.out.println(al);
        al.sort((e1, e2) -> Integer.compare(e1.eNo, e2.eNo));
        al.sort((s1,s2)->(s1.eName.compareTo(s2.eName)));
        System.out.println(al);
    }

}

class Employee{
    String eName;
    int eNo;

    public Employee(String eName, int eNo) {
        this.eName = eName;
        this.eNo = eNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eName='" + eName + '\'' +
                ", eNo=" + eNo +
                '}';
    }
}