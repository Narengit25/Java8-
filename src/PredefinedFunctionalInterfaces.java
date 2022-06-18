
// Predicate(I) :
// Only one  abstract Method

// Method : (public abstract boolean test(T t);


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//class check {
//
//    public static void main(String[] args) {
//        Predicate<Integer> p1 = i->i%2==0;
//        System.out.println(p1.test(10));
//        System.out.println(p1.test(15));

//        Predicate<Student> p1 = s->s.fees>10000&&s.gotGF==true;

//        Predicate<String> p = s -> s.length()>5;
//        System.out.println(p.test("Hi"));
//        System.out.println(p.test("Narendran"));


class check {
    public static void main(String[] args) {
        String[] s = {"Nag","Chiru","Bala","Sunny","Venkatesh","Katrina"};
        Predicate<String> p = s1-> s1.length()>5;
        Predicate<String>p1 = s1 -> s1.length()%2==0;
        for(String s1 : s){
            if(p.test(s1)){
                System.out.println(s1);
            }
            else if(p1.test(s1)){
                System.out.println(s1);
            }
        }
    }
}




class Employees{

    String name;
    double salary;

    public Employees(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class empTest{
    public static void main(String[] args) {
        ArrayList<Employees> e = new ArrayList<>();
        e.addAll(List.of(new Employees("Naren",100000),
                new Employees("Ravi",7000),
                new Employees("hari",9000),
                new Employees("Shiva",80000)));

        Predicate<Employees> p = employees -> employees.salary>5000;
        for (Employees employee :
             e ) {
            if(p.test(employee)){
                System.out.println(employee.name+ " " +employee.salary);
            }
        }
    }
}


class numberTest{
    public static void main(String[] args) {
        int [] i = {0,5,10,15,12,56,32,135,322,566,11};
        Predicate<Integer> p3 = i1->i1%2==0;
        Predicate<Integer> p4 = i1->i1>200;
        System.out.println("the Numbers which are even and greater than 10 are : " );
        for(int x1 : i){
//            if((p3.and(p4).test(x1))){
//              if((p3.or(p4).test(x1)))
            if((p3.negate().test(x1))) System.out.println(x1);
        }

    }
}