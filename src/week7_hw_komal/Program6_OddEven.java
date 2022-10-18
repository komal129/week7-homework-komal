package week7_hw_komal;

//Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Program6_OddEven {

    public static void main(String[] args) {

       Program6_OddEven obj = new Program6_OddEven();
       int num = obj.getInput();
       obj.checkEvenOdd(num);

    }

    public int getInput() {
        // Get input from user

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = s.nextInt();
        s.close();
        return num;
    }

    public void checkEvenOdd(int num){
        //check if the given number is even or odd

        if (num % 2 == 0) {

            System.out.println(num + " is an even number");

        } else {

            System.out.println(num + " is an odd number");
        }

    }
}
