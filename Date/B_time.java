import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class B_time {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        DateTimeFormatter  formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime = time.format(formatter);
        System.out.println(formattedTime);
    }
}
