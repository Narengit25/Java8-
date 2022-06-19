import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeApI {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yyyy=date.getYear();
        System.out.printf("%d-%d-%d ",dd,mm,yyyy);

        LocalTime time = LocalTime.now();
        System.out.println(time);
    }
}
