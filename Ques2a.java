package JDK8Updates;

import java.time.*;

public class Ques2a {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        LocalDate date1=LocalDate.of(1998, Month.NOVEMBER,07);
        Period gap=Period.between(date1,date);
        System.out.println("Gap is:: "+gap);
        LocalTime time=LocalTime.now();
        Duration hundredMinutes=Duration.ofMinutes(100);
        LocalTime time2=time.plus(hundredMinutes);
        System.out.println("Time after 100 mins. "+time2);


    }
}
/*
Gap is:: P23Y3M14D
Time after 100 mins. 15:36:28.816229100
 */
