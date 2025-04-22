import java.util.Calendar;
import java.util.Date;

// this class should use the java date class, and print that's days date for the customer on their receipt.
public class Today {
    Calendar rightNow = Calendar.getInstance();

    public Calendar getRightNow() {
        return rightNow;
        // should call this in main to get the current date to print
    }
}
