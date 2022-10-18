package week7_hw_komal;

/* Number of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
otherwise return false. */

public class Program4_DaysinMonth {


    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

        System.out.println(getDaysInMonth(1, 2020));

        System.out.println(getDaysInMonth(2, 2020));

        System.out.println(getDaysInMonth(2, 2018));

        System.out.println(getDaysInMonth(-1, 2020));

        System.out.println(getDaysInMonth(1, -2020));

    }

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;

        }

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            return true;
        }
        return false;

    }

    public static int getDaysInMonth(int month, int year) {

        if (year < 1 || year > 9999) {
            return -1;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return isLeapYear(year) ? 28 : 29;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }


    }
}
