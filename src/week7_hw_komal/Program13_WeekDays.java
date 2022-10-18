package week7_hw_komal;

//13. Write a Java program which input any number between 1 to 7 and it print The Days
//name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.

import java.util.Scanner;

public class Program13_WeekDays {

    public static void main(String[] args) {

        Program13_WeekDays obj = new Program13_WeekDays();
        int num1 = obj.getInput();
        obj.printTheDays(num1);

    }

    public int getInput() {
        // Get input from user
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter any number between 1 to 7: ");
        int num = s.nextInt();
        s.close();
        return num;

    }

    public void printTheDays(int num) {

        switch (num) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains only 7 days");
        }

    }
}
