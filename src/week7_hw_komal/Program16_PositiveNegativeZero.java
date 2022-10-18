package week7_hw_komal;

//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”

import java.util.Scanner;

public class Program16_PositiveNegativeZero {

    public static void main(String[] args) {

        Program16_PositiveNegativeZero obj = new Program16_PositiveNegativeZero();
        int num = obj.getInput();
        obj.checkNumber(num);


    }

    public int getInput() {
        // Get input from user
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = s.nextInt();
        s.close();
        return n;

    }

    //check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
    public void checkNumber(int n){

        if (n > 0)
        {
            System.out.println("Number is positive");
        }
        else if (n < 0)
        {
            System.out.println("Number is negative");
        }
        else
        {
            System.out.println("Number is zero");
        }
    }
}
