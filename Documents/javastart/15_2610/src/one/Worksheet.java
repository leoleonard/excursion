package one;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Worksheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj datę i godzinę rozpoczęcia pracy");

        String userInput = scanner.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(userInput, dateTimeFormatter);
        System.out.println(localDateTime);

        System.out.println("Kiedy skończyłeś?");
        String workDuration = scanner.nextLine();


        LocalDateTime localDateTime2 = LocalDateTime.parse(workDuration, dateTimeFormatter);
        Duration duration = Duration.between(localDateTime, localDateTime2);
        long hours = duration.toHours();
        System.out.println("Przepracowałeś: ");
        System.out.println(hours + " godzin");

        ZoneId zone = java.time.ZoneId.of("CET");
        ZonedDateTime start = ZonedDateTime.of(2018, 05, 15, 14, 0, 0, 0, zone);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime2, zone);
        System.out.println(zonedDateTime);

//        ZonedDateTime zonedDateFrom = ZonedDateTime.of(2018, 10, 28, 59, 0, 0, 0, zone);
//        System.out.println(zonedDateFrom);



    }

}
