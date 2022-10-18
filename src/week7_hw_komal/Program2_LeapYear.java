package week7_hw_komal;

//Write a java program to input any year like (ex.2007) and find out if it is leap year or not?

import java.util.Scanner;

public class Program2_LeapYear {

    public static void main(String[] args) {

        Program2_LeapYear obj = new Program2_LeapYear();
        int year = obj.getInput();
        obj.checkLeapYear(year);

    }

    public int getInput() {
        // Get input

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an year: ");
        int num = s.nextInt();
        s.close();
        return num;
    }

    public void checkLeapYear(int year) {
        // Check if the given year is leap year
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("Entered year is a leap year");
        } else {
            System.out.println("Entered year is not a leap year");
        }
    }
}
