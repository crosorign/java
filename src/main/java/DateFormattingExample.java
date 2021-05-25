import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormattingExample {
    // Date format can be customised here based on requirement
    private static final String DATE_FORMAT = "dd/MM/yyyy hh:mm:ss"; // day / month / year hour : min : seconds :

    public static void main(String[] args) throws ParseException {

        // Creating simple date formatter object to format timestamp in milliseconds to date
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);

        // Printing current time stamp in milliseconds to date of format mentioned above
        System.out.println("Formatted time stamp");
        System.out.println(simpleDateFormat.format(System.currentTimeMillis()));

        String formatedDate = simpleDateFormat.format(System.currentTimeMillis());
        // parsing formatted date to timestamp

        System.out.println("printing time stamp");
        System.out.println(simpleDateFormat.parse(formatedDate));

    }
}

//       Output
//
//        Formatted time stamp
//        24/05/2021 08:00:07
//        printing time stamp
//        Mon May 24 08:00:07 IST 2021

