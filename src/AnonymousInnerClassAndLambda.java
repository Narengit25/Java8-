public class AnonymousInnerClassAndLambda {

    /* TODO : Note AnonymousInnerClass != Lambda Expressions;
        if only the interface= need sto bee extended contains a
          Single-Abstract Method we can use Lambda Expressions
    */

    public static void main(String[] args) {
        Runnable r = () -> {
            for(int i=0;i<10;i++){
                System.out.println("Child Thread");
            }
        };

        Thread t = new Thread(r);
        t.start();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }

    }
}

