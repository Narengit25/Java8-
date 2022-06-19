public class DoubleColon
{

    // Best Advantage is Code Reuse-ability

    // Static code ---> className :: MethodName
    //Object Reference :: methodName

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

