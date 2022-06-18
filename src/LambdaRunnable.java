// TODO: WITHOUT LAMBDA EXPRESSION;


public class LambdaRunnable {
    public static void main(String[] args) {
        myRunnable m = new myRunnable();
        Thread t = new Thread(m);
        t.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}

class myRunnable implements Runnable{

    //job of thread
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}


//TODO: WITH LAMBDA EXPRESSION;


class threadDemo{
    public static void main(String[] args) {
        Runnable r = () -> {
            for(int i=0;i<10;i++){
                System.out.println("Lambda : Child thread");
            }
        };

        Thread t = new Thread(r);
        t.start();

        for(int i=0;i<10;i++){
            System.out.println("Lambda : Main Thread");
        }
    }
}