import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionFunctionalInterface {

    public static void main(String[] args) {
//        Function<Integer,Integer> f = i->i*i;
//        System.out.println(f.apply(2));

//        Function<String,String> f = s -> String.valueOf(s.length());
//        System.out.println(f.apply("Naren"));

//        Function<String,String>f = s -> s.toUpperCase();
//        System.out.println(f.apply("Naren"));

        Function<Student, String> f = student -> {
            int marks = student.marks;
            String Grade = " ";
            if (marks > 80) Grade = "A";
            else if (marks > 60) Grade = "B";
            else if (marks > 30) Grade = "C";
            else Grade = "Failed";
            return Grade;
        };
        Predicate<Student> p = student -> student.marks > 60;

        Student[] s = {new Student("Naren", 100),
                new Student("Hari", 40),
                new Student("Janaki", 99),
                new Student("Krishna", 54),
                new Student("Shanthi", 87)
        };
        for (Student s1 : s) {

            if (p.test(s1)) {

                System.out.println("StudentName : " + s1.sName);
                System.out.println("StudentMarks: " + s1.marks);
                System.out.println("StudentGrade: " + f.apply(s1));
                System.out.println();
            }

        }
    }

}
     class Student {
        String sName;
        Integer marks;

        public Student(String sName, Integer marks) {
            this.sName = sName;
            this.marks = marks;
        }
    }


    class functionTest {

        public static void main(String[] args) {
            Function<Integer,Integer> f1 = integer -> 2*integer;
            Function<Integer,Integer> f2 = integer -> integer*integer*integer;

            System.out.println(f1.andThen(f2).apply(2));
            System.out.println(f1.compose(f2).apply(2));

        }
    }
