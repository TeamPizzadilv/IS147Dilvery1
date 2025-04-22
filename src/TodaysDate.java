import java.util.Calendar;

// this class should use the java date class, and print that's days date for the customer on their receipt.
public class TodaysDate {
    Calendar rightNow = Calendar.getInstance();

    public Calendar getRightNow() {
        return rightNow;
        // should call this in main to get the current date to print
    }
}
