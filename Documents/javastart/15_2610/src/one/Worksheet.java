package one;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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

        System.out.println("Ile pracowałeś godzin?");
        String workDuration = scanner.nextLine();

        LocalDateTime localDateTime2 = LocalDateTime.parse(workDuration, dateTimeFormatter);
        Duration duration = Duration.between(localDateTime, localDateTime2);
        duration.toHours();
        System.out.println(duration);
    }

}
