import java.time.*;
import java.util.Scanner;

public class DateTimeApI {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yyyy=date.getYear();
        System.out.printf("%d-%d-%d ",dd,mm,yyyy);
// Time

        LocalTime time = LocalTime.now();
        System.out.println(time);

        int h = time.getHour();
        int m = time.getMinute();
        int s = time.getSecond();
        int n = time.getNano();

        System.out.printf("%d:%d:%d:%d",h,m,s,n);

        System.out.println();
        System.out.println();

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        int date1 = localDateTime.getDayOfMonth();
        int month = localDateTime.getMonthValue();
        int year = localDateTime.getYear();
        System.out.printf("%d-%d-%d",date1,month,year);

        int hour = localDateTime.getHour();
        int min = localDateTime.getMinute();
        int sec = localDateTime.getSecond();
        int nano = localDateTime.getNano();
        System.out.printf("\n%d:%d:%d:%d",hour,min,sec,nano);

    }

}


class dateTime1{

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(1999, Month.JUNE,25,8,45,11);
        System.out.println(dateTime);
        System.out.println("after 6 Months : " +dateTime.plusMonths(6) );
        System.out.printf("before 6 months : " +dateTime.minusMonths(6));
    }
}

class birth{
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1999,06,25);
        LocalDate d = LocalDate.now();

        Period p = Period.between(birthday,d);

        Period lt = p.plusDays(5);


        System.out.printf("Your age is %d Years : %d months : and %d Days"
                ,p.getYears(),p.getMonths(),p.getDays());

        System.out.printf(" Your age is %d Years : %d months : and %d Days"
                ,lt.getYears(),lt.getMonths(),lt.getDays());
    }
}



class leap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int n = sc.nextInt();

        Year y = Year.of(n);

        if(y.isLeap())
            System.out.printf("%d year is Leap Year",n);
        else
            System.out.printf("%d year is Not a Leap Year " ,n);

    }
}



class zone{


    public static void main(String[] args) {
        ZoneId z = ZoneId.systemDefault();
        System.out.println(z);

        ZoneId z1 = ZoneId.of("America/Los_Angeles");
        ZonedDateTime dt = ZonedDateTime.now(z1);
        System.out.println(dt);
    }
}