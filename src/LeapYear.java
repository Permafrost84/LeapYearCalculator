/* Calculates if a given year (integer) is or isn't a leap year */


public class LeapYear {

    public static boolean isLeapYear(int year) {
        boolean yearIsLeapYear;

        // if year is NOT in supported range of years, return false
        if (!((year >= 1) && (year <= 9999))) {
            return false;
        }

        // calculate if input is a leap year
        if (year % 4 != 0) {
            yearIsLeapYear = false; // if year is not divisible by 4, than it is a common year
        } else if (year % 100 != 0) {
            yearIsLeapYear = true; // if year is not divisible by 100, but divisible by 4, than it is leap year
        } else if (year % 400 != 0) {
            yearIsLeapYear = false; // if year is not divisible by 400, but not divisible by 100, but divisible by 4, than it is a common year
        } else {
            yearIsLeapYear = true; // else, it is a leap year
        }

        return yearIsLeapYear;
    }
}
