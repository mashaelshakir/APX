package apex;

/**
 * Represents a date of birth with day, month, and year in the Islamic calendar.
 *
 * @author Mashael Shaker
 */
public class dateOfBirth {
    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int APRIL = 4;
    public static final int MAY = 5;
    public static final int JUNE = 6;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int SEPTEMBER = 9;
    public static final int OCTOBER = 10;
    public static final int NOVEMBER = 11;
    public static final int DECEMBER = 12;

    private int day;
    private int month;
    private int year;

    /**
     * Default constructor initializes date to 0 (no specific date).
     */
    public dateOfBirth() {
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    /**
     * Parameterized constructor to set day, month, and year.
     *
     * @param day The day of the month
     * @param month The month, based on the Islamic calendar constants
     * @param year The year of birth
     */
    public dateOfBirth(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Creates a copy of the current dateOfBirth object.
     *
     * @return A new dateOfBirth object with the same values
     */
    public dateOfBirth copy() {
        dateOfBirth d = new dateOfBirth();
        d.day = day;
        d.month = month;
        d.year = year;
        return d;
    }

    /**
     * Sets the day of the month.
     *
     * @param d The day to set
     */
    public void setDay(int d) {
        day = d;
    }

    /**
     * Sets the month.
     *
     * @param m The month to set
     */
    public void setMonth(int m) {
        month = m;
    }

    /**
     * Sets the year.
     *
     * @param y The year to set
     */
    public void setYear(int y) {
        year = y;
    }

    /**
     * Gets the day of the month.
     *
     * @return The day of the month
     */
    public int getDay() {
        return day;
    }

    /**
     * Gets the month.
     *
     * @return The month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Gets the year.
     *
     * @return The year
     */
    public int getYear() {
        return year;
    }

    /**
     * Returns a string representation of the date in (day, month, year) format.
     *
     * @return A string representing the date
     */
    @Override
    public String toString() {
        return "(" + day + ", " + month + ", " + year + ")";
    }
}

