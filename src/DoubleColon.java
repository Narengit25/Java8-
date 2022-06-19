public class DoubleColon
{

    // Best Advantage is Code Reuse-ability

    // Static code ---> className :: MethodName
    //Object Reference :: methodName
    // Different Return types are allowed, But Arguments Must be Same

    public static void main(String[] args) {

       colonTest t = new colonTest(); //Object Reference
        Runnable r = t::m1;
/*
                () -> {
            for(int i=0;i<10;i++){
                System.out.println("Child-Thread");
            }
        };
*/
        Thread t1 = new Thread(r);
        t1.start();
        for(int i=0;i<10;i++){
            System.out.println("Main-Thread");
        }
    }
}

class colonTest{
    public void m1(){
        for(int i=0;i<10;i++) {
            System.out.println("Child");
        }
    }
}

interface  Interface1{
     void add(int a,int b);

     static void product(double x, double y){
         System.out.println("The Product is : " + (x*y));
     }
}

class colon{

    public static void main(String[] args) {
        Interface1 i2 =(a, b) -> System.out.println(a+b);
        i2.add(2,3);

        Interface1 i1 = Interface1::product;
        i1.add(10,20);  // return type and name must not be Same

    }

}