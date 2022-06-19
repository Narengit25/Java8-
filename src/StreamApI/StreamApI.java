package StreamApI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

       // System.out.println(i.stream().map(integer -> integer*2).reduce(0,(integer, integer2) -> integer+integer2));

//        System.out.println(list.stream());

         List<Integer> l2 = list.stream().filter(integer -> integer%2==0).collect(Collectors.toList());
         System.out.println(l2);

         List<Integer> l3 = list.stream().map(integer -> integer+5).collect(Collectors.toList());
         System.out.println(l3);




    }

}


class example1{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> marks = new ArrayList<>(List.of(25, 45, 66, 33, 78, 45, 78, 88, 99, 21, 63, 83, 100, 93));
        ArrayList<String> names = new ArrayList<>(List.of("Kolhi", "Anushka", "hansika", "Tammana", "rishi"));

        List<Integer> l = al.stream().filter(integer -> integer % 2 == 0).toList();
        System.out.println(l);

        List<Integer> l1 = al.stream().map(integer -> integer * 2).toList();
        System.out.println(l1);

        long l3 = marks.stream().filter(integer -> integer < 35).count();

        System.out.println(l3);

        List<Integer> sortedList = marks.stream().sorted().toList();
        System.out.println(sortedList);

        List<Integer> customSort = marks.stream().sorted((o1, o2) -> o2.compareTo(o1)).toList();
        System.out.println(customSort);

        Comparator<String> c = (s1, s2) -> {
            int i1 = s1.length();
            int i2 = s2.length();
            if (i1 > i2) return 1;
            else if (i1 < i2) return -1;
            else return s1.compareTo(s2);
        };

        List<String> customNameSort = names.stream().sorted(c).toList();
        System.out.println(customNameSort + "        by:Length");

        Integer min = marks.stream().min(Integer::compareTo).get();
        System.out.println(min);

        Integer max = marks.stream().max(Integer::compareTo).get();
        System.out.println(max);

        

    }
}




