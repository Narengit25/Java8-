import java.util.function.Consumer;

public class ConsumerTest {

    //Predicate <T> -->Boolean
    //Function <T,R> ---> R type
    // Consumer <T> --->Void

    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Naren");
    }

}
