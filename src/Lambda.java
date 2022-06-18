public class Lambda {

    public static void main(String[] args) {

        i i = new demo();
        i.m1();

    }

}
    @FunctionalInterface
    interface i {
        public void m1();

        default void m2() {

        }

        public static void m3() {

        }
    }

    class demo implements i{
        @Override
        public void m1() {
            System.out.println("Naren");
        }
}


// TODO: with Lambda Expression;


interface i1 {
    public void m1();

}

class test {

    public static void main(String[] args) {

        //FUNCTIONAL INTERFACE
        i1 i = ()-> System.out.println("Lambda Expression implementation");
        i.m1();
    }
}






@FunctionalInterface
interface i3{
    public void add(int a,int b);
}

class add{
    public static void main(String[] args) {
        i3 i = (a, b) -> System.out.println("Sum is : "+ (a+b));
        i.add(2,3);
        i.add(100,200);
    }
}


interface i4{
    public int getLength(String s);
}

class lengthDemo{
    public static void main(String[] args) {
        i4 i = s -> s.length();
        System.out.println(i.getLength("Hello"));
        System.out.println(i.getLength("Naren"));
    }
}

interface i5 {
    public int squareIt(int n);
}
class square{
    public static void main(String[] args) {
        i5 i = n -> n*n;
        System.out.println(i.squareIt(2222));
    }
}


