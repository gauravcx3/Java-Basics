import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
  // Instant Class
  // --> Optimised for time-stamping events
  // --> Well suited for relative time comparisons
  // --> Can be converted into more complex date/time types
  static void compareInstants(Instant otherInstant) {
    Instant now = Instant.now();

    if (otherInstant.compareTo(now) > 0) {
      System.out.println("The other instant is in the future");
    } else if (otherInstant.compareTo(now) < 0) {
      System.out.println("The other instant is in the past");
    } else {
      System.out.println("The other instant is now");
    }
  }

  public static void main(String[] args) {
    Instant someInstant = Instant.now();
    try {
      Thread.sleep(100);          // sleep for 100 milliseconds
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    compareInstants(someInstant); // someInstant is now in the past (after 100 milliseconds)

    // Local Date/Time
    // --> No timezone information
    // --> Can be used to find the current date/time
    // --> Can be used to find differences between dates/times
    // --> Values can be incremented/decremented
    // --> Can be converted converted to/from string
    LocalTime time = LocalTime.now();
    System.out.println(time);
    LocalDate date = LocalDate.now();
    System.out.println(date);
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println(dateTime);

    // Converting Strings to LocalDate
    String dateString = "2022-01-01";
    LocalDate customDate = LocalDate.parse(dateString);
    LocalDate newDate = customDate.plusDays(3); // Add 3 days to the custom date
    System.out.println(newDate);

    // Printing LocalDate with String.format 
    // --> using %s automatically converts LocalDate to String
    String printDate = String.format("%s / %s / %s", dateString, customDate, newDate);
    System.out.println(printDate);

    // ZonedDateTime
    // --> Supports timezone information
    // --> Can work with values accross timezones
    // --> Can be converted to different time zones

    // DateTimeFormatter
    LocalDate today = LocalDate.now();
    System.out.println(today);
    DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String formattedDate = today.format(myFormat);
    System.out.println(formattedDate);

    // Parsing Strings to LocalDate
    String strDate = "01-02-2020";
    LocalDate parsedDate = LocalDate.parse(strDate, myFormat);
    System.out.println(parsedDate);
    
    formattedDate = parsedDate.format(myFormat);
    System.out.println(formattedDate);

  }
}
