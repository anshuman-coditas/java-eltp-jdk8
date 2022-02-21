package JDK8Updates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class Ques2b {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        LocalDate year=date.plus(10, ChronoUnit.YEARS);
        System.out.println("Year after 10 years is:: "+year);
        LocalDate week=date.plus(30,ChronoUnit.WEEKS);
        System.out.println("Date after 30 Weeks:: "+week);
        LocalDate dayOfNextMonth=date.with(TemporalAdjusters.firstDayOfNextMonth());
        LocalDate lastOfMonth=date.with(TemporalAdjusters.lastDayOfMonth());
        LocalDate nextSaturday=date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println("First Day of Next Month:: "+dayOfNextMonth);
        System.out.println("Last Day of Month:: "+lastOfMonth);
        System.out.println("Next Saturday:: "+nextSaturday);
    }
}
/*
Year after 10 years is:: 2032-02-21
Date after 30 Weeks:: 2022-09-19
First Day of Next Month:: 2022-03-01
Last Day of Month:: 2022-02-28
Next Saturday:: 2022-02-26
 */