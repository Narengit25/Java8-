class defaultDemo implements J{

    // if child  is not ok with parent it can override them

    @Override
    public void m1() {
        System.out.println("Naren Overriding Default Method");
    }

    public static void main(String[] args) {
        defaultDemo d = new defaultDemo();
        d.m1();
    }
}



interface J{

    default void m1(){
        System.out.println("Default Method");
    }
}


interface P1{
    default void m1(){
        System.out.println("p1 method");
    }
}
interface P2{
    default void m1(){
        System.out.println("p2 method");
    }
}

class Test1 implements P1,P2{

    @Override
    public void m1() {
         P1.super.m1();
         P2.super.m1();
         System.out.println("Implemented method");
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.m1();
    }
}



interface k{
    public static void m1(){
        System.out.println("Interface Static Method");
    }
}
class staticTest {
    public static void main(String[] args) {
        k.m1();
    }
}



interface G {
    static void main(String[] args) {
        System.out.println("Interface main method");
    }
}





