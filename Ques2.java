package JDK8Updates;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ques2 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println("Today:: "+date);
        LocalTime time=LocalTime.now();
        System.out.println("Current Time:: "+time);
        LocalDateTime datetime=LocalDateTime.now();
        DateTimeFormatter format=DateTimeFormatter.ofPattern("dd.MM.yyyy ss:mm:HH" );
        String formattedDateTime=datetime.format(format);
        System.out.println("Formatted:: "+formattedDateTime);
        ZonedDateTime currZone=ZonedDateTime.now();
        System.out.println("Current Zone:: "+currZone);
        ZoneId australia=ZoneId.of("Australia/Sydney");
        ZonedDateTime australiazone=currZone.withZoneSameInstant(australia);
        System.out.println("Australia Time Zone:: "+australiazone);
        DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd.MM.yyyy ss:mm:HH" );
        String formattedDateTime1=australiazone.format(format1);
        System.out.println("Australia Time & Date:: "+formattedDateTime1);

    }
}
/*
Today:: 2022-02-21
Current Time:: 13:56:12.073936700
Formatted:: 21.02.2022 12:56:13
Current Zone:: 2022-02-21T13:56:12.073936700+05:30[Asia/Calcutta]
Australia Time Zone:: 2022-02-21T19:26:12.073936700+11:00[Australia/Sydney]
Australia Time & Date:: 21.02.2022 12:26:19
 */
