import java.util.Arrays;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);
/*        for (Integer i:
             l) {
            System.out.println(i);
        }*/
        l.forEach(System.out::println);
    }
}

interface i11{

    void multiply(int g ,int h);

    static void add(int x, int y) {
        System.out.println(x+y);
    }
}

class implementation{

    public static void main(String[] args) {

        i11 i = (g, h) -> System.out.println(g*h);
        i.multiply(2,4);
        i11 i1 = i11::add;
        i1.multiply(2,4);
    }
}